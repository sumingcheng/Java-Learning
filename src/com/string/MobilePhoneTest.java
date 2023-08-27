package com.string;

import java.util.Arrays;

public class MobilePhoneTest {
    public static void main(String[] args) {
        String data = "[" +
            "{" +
                "product_name: \"HUAWEI mate X3\"," +
                "price: 15999," +
                "color: \"green\"" +
            "}," +
            "{" +
                "product_name: \"HONOR magic V2\"," +
                "price: 8999," +
                "color: \"black\"" +
            "}," +
            "{" +
                "product_name: \"VIVO fold 2\"," +
                "price: 9999," +
                "color: \"blue\"" +
            "}" +
        "]";

        /**
         * [product_name="HUAWEI mate X3",price=15999.0,color="green"]
         * [product_name="HONOR magic V2",price=8999.0,color="black"]
         * [product_name="VIVO fold 2",price=9999.0,color="blue"]
         */
//        String initialData1 = handleBracket(data, "[", "]");
//        String[] initialData2 = handleObject(initialData1);

//        for (String phoneInfo: initialData2) {
//            System.out.println(phoneInfo);
//        }

//        MobilePhone[] mobilePhoneArr =  handleMobilePhoneInfo(initialData2);

        MobilePhone[] mobilePhoneArr = handleMobilePhoneInfo(
                handleObject(
                        handleBracket(data, "[", "]")
                )
        );

        for (int i = 0; i < mobilePhoneArr.length; i ++) {
            System.out.println(mobilePhoneArr[i].toString());
        }
    }

    // 去掉括号

    public static String handleBracket (String data, String beginBracket, String endBracket) {
        return data.replace(beginBracket, "").replace(endBracket, "");
    }

    public static String[] handleObject (String data) {
        String[] dataArr = {};

        int fromIndex = 0;

        for (int i = 0; i < 3; i ++) {
            int endIndex = data.indexOf("}", fromIndex);
            String subStr = data.substring(fromIndex, endIndex + 1);
            dataArr = Arrays.copyOf(dataArr, dataArr.length + 1);
            dataArr[dataArr.length - 1] = subStr;
            fromIndex = endIndex + 2;
        }

        return dataArr;
    }

    public static MobilePhone[] handleMobilePhoneInfo (String[] data) {
        MobilePhone[] mobilePhoneArr = new MobilePhone[3];

        for (int i = 0; i < data.length; i ++) {
            String infoStr = data[i];
            String mobilePhoneInfoStr = handleBracket(infoStr, "{", "}");
            String[] keyValueArr = mobilePhoneInfoStr.split(",");

            String productName = keyValueArr[0].split(":")[1].trim();
            float price = Float.parseFloat(keyValueArr[1].split(":")[1]);
            String color = keyValueArr[2].split(":")[1].trim();

            mobilePhoneArr[i] = new MobilePhone(productName, price, color);
        }

        return mobilePhoneArr;
    }
}
