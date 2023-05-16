package com.arraylgorthm;

import java.util.Scanner;

public class binarySearch {
    public static void main (String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("请输入你要查找的数");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int index = BinarySearch(arr, target);
        System.out.println("Index of " + target + " is: " + index);
    }

    public static int BinarySearch (int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) >>> 1;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
