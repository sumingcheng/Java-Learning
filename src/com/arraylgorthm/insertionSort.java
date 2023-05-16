package com.arraylgorthm;

import java.util.Arrays;
/*
* 直接插入排序
* */
public class insertionSort {
    public static void main (String[] args) {
        int[] arr = {4, 2, 6, 3, 1, 5};

        System.out.println(Arrays.toString(StraightInsertionSort(arr)));
    }

    public static int[] StraightInsertionSort (int[] arr) {
        int[] _arr = Arrays.copyOf(arr, arr.length);

        for (int i = 1; i < _arr.length; i++) {
            int temp = _arr[i];
            int j = 0;

            for (j = i - 1; j >= 0; j--) {
                // TODO 重点
                if (_arr[j] > temp) {
                    _arr[j + 1] = _arr[j];
                } else {
                    break;
                }
            }
            _arr[j + 1] = temp;
        }
        return _arr;
    }
}
