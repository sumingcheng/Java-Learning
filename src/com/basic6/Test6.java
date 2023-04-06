package com.basic6;

public class Test6 {
    public static void main(String[] args) {
        /*
         * 100 以内的奇数
         * */

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                break;
            }
            System.out.println(i); // 1
        }
    }
}
