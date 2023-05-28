package com.oop;

import java.util.Arrays;

public class DynamicArray {
    private int[] arr = null;
    private int count = 0;

    public DynamicArray () {
    }

    public DynamicArray (int Size) {
        arr = new int[Size > 0 ? Size : 3];
    }

    public int push (int num) {
        if (count >= arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 3 / 2 + 1);
        }

        arr[count++] = num;
        return count;
    }

    public int[] getArr () {
        return arr;
    }
}
