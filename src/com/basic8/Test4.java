package com.basic8;

import java.util.Arrays;

public class Test4 {
    public static void main (String[] args) {
//        int[] arr = new int[5];
//        System.out.println(arr);
//        // java: 无法为最终变量length分配值
//        arr.length = 10;

//        int length = 5;
//        int[] arr = new int[length];
//        System.out.println(length); // 5
//        length = 10;
//        // 变量重新赋值不影响数组长度
//        System.out.println(arr.length); // 5
//        int[] arr = {1, 2, 3, 4};
//        int[] newArr = new int[arr.length * 3];
//
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(newArr));
//
//        char[] arr = new char[10];
//        System.out.println(Arrays.toString(arr));
        /*
         * 1. 源数组
         * 2. 从源数组下标为几的位置开始赋值
         * 3. 目标数组
         * 4. 从目数组下标为几的位置开始赋值
         * 5. 从源数组中复制几个元素到目标数组
         * */
//        int[] arr1 = {1, 2, 3};
//        int[] arr2 = new int[6];
//        System.arraycopy(arr1, 0, arr2, 3, 3);
//
//        System.out.println(Arrays.toString(arr2));
//        // [0, 0, 0, 1, 2, 3]

        /*
         * 1.源数组
         * 2.新数组的长度
         * */
        int[] arr1 = {1, 2, 3};
        int[] arr3 = Arrays.copyOf(arr1, arr1.length * 3);
        System.out.println(Arrays.toString(arr3));
    }
}
