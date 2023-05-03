package com.basic8;

import java.util.Arrays;

public class Test5 {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = test(arr);
        System.out.println(Arrays.toString(newArr));
        /*
         * 新数组和原数组是同一个值
         * */
//        System.out.println(arr == newArr); // true
//        System.out.println(Arrays.toString(arr)); // [2, 4, 6, 8, 10]
//        System.out.println(Arrays.toString(newArr)); // [2, 4, 6, 8, 10]
    }

    //    public static int[] test (int[] arr) {
//        int len = arr.length;
//        for (int i = 0; i < len; i++) {
//            arr[i] *= 2;
//        }
//        return arr;
//    }

    public static int[] test (int[] arr) {
        // copyOf 返回了一个新的数组
        int[] len = Arrays.copyOf(arr, arr.length * 3);
        System.out.println(Arrays.toString(len));
        return arr;
    }


}
