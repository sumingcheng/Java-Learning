package com.string;

public class MyStringTest {
    public static void main (String[] args) {
        double res = appendStrByString();
        System.out.println(res);

        double resBuffer = appendStrByStringBuffer();
        System.out.println(resBuffer);

        double resBuilder = appendStrByStringBuilder();
        System.out.println(resBuilder);
    }

    // 不可变字符串，每次修改都会生成新的字符串对象
    // 每次使用都要去常量池中查找，效率低
    public static double appendStrByString () {
        String str = "";

        double beginTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            str += i;
        }

        double endTime = System.currentTimeMillis();

        return endTime - beginTime;
    }

    // 可变字符串，每次修改都会在原来的字符串上修改
    public static double appendStrByStringBuffer () {
        StringBuffer str = new StringBuffer();

        double beginTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            str.append(i);
        }

        double endTime = System.currentTimeMillis();

        return endTime - beginTime;
    }

    // 可变字符串，适合单线程场景
    public static double appendStrByStringBuilder () {
        StringBuilder str = new StringBuilder();

        double beginTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            str.append(i);
        }

        double endTime = System.currentTimeMillis();

        return endTime - beginTime;
    }
}
