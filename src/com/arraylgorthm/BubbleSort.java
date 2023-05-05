package com.arraylgorthm;

import java.util.Arrays;

/*
 * 冒泡排序
 * 核心，大数向右，小数向左
 * */
public class BubbleSort {
    public static void main (String[] args) {
        // 数组排序
        int[] arr = {3, 5, 1, 0, 6};

        int[] bubblingArr = bubbling(arr);

        System.out.println(Arrays.toString(bubblingArr));
    }

    public static int[] bubbling (int[] arr) {
        int[] _arr = arr;
        int len = arr.length;
        int temp;

        for (int j = len - 1; j > 0; j--) {

            for (int i = 0; i < j; i++) {
                if (_arr[i] > _arr[i + 1]) {
                    temp = _arr[i];
                    _arr[i] = _arr[i + 1];
                    _arr[i + 1] = temp;
                } else {

                }
            }

        }
        return _arr;
    }
}
