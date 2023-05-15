package com.arraylgorthm;

public class binarySearch {
    public static void main (String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int index = BinarySearch(arr, target);
        System.out.println("Index of " + target + " is: " + index);
    }

    public static int BinarySearch (int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println(mid);
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
