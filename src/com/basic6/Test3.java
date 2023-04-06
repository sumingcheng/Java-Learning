package com.basic6;

import java.util.Scanner;
import java.math.BigDecimal;

public class Test3 {
    public static void main(String[] args) {
        /*
         * 1. 查询账户余额，输出总额
         * 2. 记录收入，总额+收入=新总额
         * 3. 记录支出，总额-支出=新总额
         * 4. 退出
         * */

        int selectionNumber = 0;
        BigDecimal sum = new BigDecimal("0");

        do {
            System.out.println("1. 查询账户余额，输出总额\n" +
                    "2. 记录收入，总额+收入=新总额\n" +
                    "3. 记录支出，总额-支出=新总额\n" +
                    "4. 退出");
            // 接收输入
            selectionNumber = new Scanner(System.in).nextInt();

            switch (selectionNumber) {
                case 1:
                    System.out.println("您的账户余额为：" + sum);
                    break;
                case 2:
                    System.out.println("请输入收入金额：");
                    BigDecimal income = new Scanner(System.in).nextBigDecimal();
                    sum = sum.add(income);
                    System.out.println("您的账户余额为：" + sum);
                    break;
                case 3:
                    System.out.println("请输入支出金额：");
                    BigDecimal expense = new Scanner(System.in).nextBigDecimal();
                    sum = sum.subtract(expense);
                    System.out.println("您的账户余额为：" + sum);
                    break;
                case 4:
                    System.out.println("您已经退出了记账本！");
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }

        } while (selectionNumber < 4);
    }
}
