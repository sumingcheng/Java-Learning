package com.arraylgorthm;


import java.util.Arrays;

public class SelectionSort {
    public static void main (String[] args) {
        int[] arr = {2, 5, 7, 4, 7, 1, 0, 2};

        int[] newArr = selectSort(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] selectSort (int[] arr) {
        int[] _arr = Arrays.copyOf(arr, arr.length);
        int sub = 0;

        for (int i = 0; i < _arr.length - 1; i++) {
            sub = i;
            for (int j = sub + 1; j < _arr.length; j++) {
                if (_arr[sub] > _arr[j]) {
                    sub = j;
                }
            }
            if (sub != i) {
                _arr[sub] = _arr[sub] + _arr[i];
                _arr[i] = _arr[sub] - _arr[i];
                _arr[sub] = _arr[sub] - _arr[i];
            }
        }

        return _arr;
    }
}
