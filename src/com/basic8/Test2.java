package com.basic8;

import java.util.Arrays;

/*
 * 遍历和迭代
 * */
public class Test2 {
    public static void main (String[] args) {
        int[] num = {1, 2, 4, 5, 6, 7};

        System.out.println(num[30]);
//        forEachArgs(num);
//
//        argsTest(1, 2, 3, 4, 5);

//        nullPointerException(null);
    }

    /*
     * args 是一个数组
     * args 可以接收剩余参数, Vararg 形参必须为列表中的最后一个形参
     * */
    public static void forEachArgs (int... args) {
        System.out.println(Arrays.toString(args));
    }

    public static void argsTest (int x, int... args) {
        System.out.println(Arrays.toString(args));
    }

    public static void nullPointerException (int[] raw) {
        //    Exception in thread "main" java.lang.NullPointerException
        for (int elem : raw) {
            System.out.println(elem);
        }
    }
}
