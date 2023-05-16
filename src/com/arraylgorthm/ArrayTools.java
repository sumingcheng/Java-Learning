package com.arraylgorthm;

import java.util.Arrays;

public class ArrayTools {
    public static void main (String[] args) {
        int[] arr = {4, 2, 6, 3, 1, 5};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int retIndex = Arrays.binarySearch(arr, 2);

        System.out.println(retIndex);
    }
}
