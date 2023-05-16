package com.arraylgorthm;

import java.util.Arrays;

public class quickSort {
    public static void main (String[] args) {
        int[] arr = {2, 5, 7, 4, 7, 1, 0, 2};

        int[] newArr = quickSort(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] quickSort (int[] arr) {
        int[] _arr = Arrays.copyOf(arr, arr.length);


        return _arr;
    }
}
