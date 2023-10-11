package com.Exception;

/*
 * final:声明常量
 * finalize:处理垃圾回收
 * finally:异常处理的出口
 * */

public class Test2 {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int el = getArrElement(arr, 4);
        System.out.println(el);
    }

    public static int getArrElement (int[] arr, int index) {
        try {
            return arr[index];
        } catch (Exception e) {
            System.out.println("数组下标越界");
        } finally {
            System.out.println("finally");
        }
        return -1;
    }
}
