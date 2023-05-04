package com.basic8;

import java.util.Arrays;

/*
 * 二维数组
 * */
public class Test6 {
    public static void main (String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 4, 5}, {4, 5, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
