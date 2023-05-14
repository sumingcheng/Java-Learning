package com.arraylgorthm;

import java.util.Arrays;

public class insertionSort {
    public static void main (String[] args) {
        int[] arr = {4, 2, 6, 3, 1, 5};

        StraightInsertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] StraightInsertionSort (int[] arr) {
        int[] _arr = Arrays.copyOf(arr, arr.length);

        for (int i = 1; i < _arr.length; i++) {
            int temp = _arr[i];
            int j = i - 1;

            while (j >= 0 && _arr[j] > temp) {
                _arr[j + 1] = _arr[j];
                // TODO 重点理解这个地方
                j--;
            }
            _arr[j + 1] = temp;
        }
        return _arr;
    }
}
