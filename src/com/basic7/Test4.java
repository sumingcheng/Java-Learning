package com.basic7;

import java.util.Scanner;

/*
 * 方法调用
 * */
public class Test4 {
    public static void main(String[] args) {
//        递归调用 : recursion
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        test(num);
//        System.out.println(factorial(num));
        System.out.println(fibonacci(num));
    }

    public static void test(int num) {
//        递归的出口，必要条件
        if (num == 0) return;
        System.out.println(num);
        test(--num);
    }

    public static int factorial(int num) {
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }

    //    斐波那契
    public static int fibonacci(int num) {
        if (num == 1 || num == 2) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
