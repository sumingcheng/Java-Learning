package com.basic4;

// 导入java.util包下的Scanner类

import java.util.Scanner;
import java.math.BigDecimal;

public class Test6 {
    public static void main(String[] args) {
//        // 创建Scanner对象,类型为Scanner,等待输入
//        Scanner sc = new Scanner(System.in);
//        // 等待控制台输入
//        String text = sc.next();
//        // 输入结束
//        System.out.println("输入结束");
//        System.out.println("输入的内容为:" + text);

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("请输入姓名:");
//        // 字符串
//        String name = sc.next();
//        System.out.println("请输入年龄:");
//        // 整数
//        int age = sc.nextInt();
//        System.out.println("请输入性别: 男 or 女");
//        // 取一个字符
//        char gender = sc.next().charAt(0);
//        System.out.println("请输入身高:");
//        // 浮点数
//        double height = sc.nextDouble();
//
//        System.out.println("姓名:" + name + "\n"
//                + "年龄:" + age + "\n"
//                + "性别:" + gender + "\n"
//                + "身高:" + height + "\n"
//        );

        Scanner sc = new Scanner(System.in);

//        System.out.println("请输入小数");
//        float f = sc.nextFloat();
//        System.out.println("请输入第二个小数");
//        float f2 = sc.nextFloat();


        System.out.println("请输入小数");
        String f = sc.next();
        System.out.println("请输入第二个小数");
        String f2 = sc.next();
        System.out.println("请选择运算符: + - * /");

        char type = sc.next().charAt(0);
        // 结果

        System.out.print("运算结果为:a" + type + "b=");

        BigDecimal b1 = new BigDecimal(f);
        BigDecimal b2 = new BigDecimal(f2);

        switch (type) {
            case '+':
                System.out.println(b1.add(b2));
                break;
            case '-':
                System.out.println(b1.subtract(b2));
                break;
            case '*':
                System.out.println(b1.multiply(b2));
                break;
            case '/':
                System.out.println(b1.divide(b2));
                break;
            default:
                System.out.println("输入错误");
                break;
        }

    }
}
