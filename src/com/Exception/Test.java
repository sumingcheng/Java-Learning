package com.Exception;

import java.util.Arrays;

public class Test {
    public static void main (String[] args) {
//        div(1, 0);
//        String str = null;
//        try {
//            int res = getLength(str);
//        } catch (NullPointerException e) {
//            System.out.println(e);
//        }

        Student[] arr = {
                new Student("张三", 18),
                new Student("张4", 12),
        };
        System.out.println(Arrays.toString(arr));

//        Object x = new String("hello");
//        try {
//            Integer i = (Integer) x;
//        } catch (ClassCastException e) {
//            e.printStackTrace();
//        }
    }

    public static void div (int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static int getLength (String str) {
        return str.length();
    }

    public static Student[] getSortedArr (Student[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
