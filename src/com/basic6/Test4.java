package com.basic6;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*
         * 生成 6 位随机数（字符串）
         * */
//        a~z = 97~122

        String randomStr = "";
        Random randomTool = new Random();
        do {
            char c = (char) (randomTool.nextInt(25) + 97);
            randomStr += c;
        } while (randomStr.length() < 6);

        System.out.println(randomStr);
    }
}
