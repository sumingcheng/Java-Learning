package com.basic7;

import java.util.Scanner;

/*
 * 计算器
 * */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();

        System.out.println("请输入运算类型");
        String type = sc.next();

        int result = Calculate(type, num1, num2);

        System.out.println("运算结果是：" + result);
    }

    public static int Calculate(String type, int num1, int num2) {
        switch (type) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }
}
