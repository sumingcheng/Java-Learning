package com.oop;

import java.util.Arrays;

public class Test12 {
    public static void main (String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.push(1);
        dynamicArray.push(1);
        dynamicArray.push(1);
        dynamicArray.push(1);
        dynamicArray.push(9);
        dynamicArray.push(9);
        dynamicArray.push(9);
        dynamicArray.push(9);
        dynamicArray.push(9);
        dynamicArray.push(9);

        System.out.println(Arrays.toString(dynamicArray.getArr()));
    }
}
