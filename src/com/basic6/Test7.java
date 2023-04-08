package com.basic6;

public class Test7 {
    public static void main(String[] args) {
        /*
         * 多重循环！
         * */
        // 左三角

//        for (int i = 0; i <= 5; i++) {
//            for (int k = 0; k < i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
         * 多重循环！
         * */
        // 倒三角

//        for (int i = 0; i <= 5; i++) {
//            for (int k = 5; k > i; k--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
         * 多重循环！
         * */
        // 左直角三角形

//        for (int i = 1; i <= 5; i++) {
//
//            for (int k = 5; k >= 1; k--) {
//                if (k <= i) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        /*
         * 多重循环！
         * */
        // 倒直角三角形

//        for (int i = 5; i >= 1; i--) {
//
//            for (int k = 5; k >= 1; k--) {
//                if (k <= i) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        /*
         * 多重循环！
         * */
        // 杨辉三角

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
