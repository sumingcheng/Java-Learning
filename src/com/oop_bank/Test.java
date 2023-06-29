package com.oop_bank;

import java.util.Scanner;

/**
 * 银行账户
 *
 * 银行账号
 * 余额
 *
 * 1. 查询余额
 * 2. 存款
 * 3. 取款
 * 4. 转账
 * 5. 查询账单
 *
 * 类
 * 1. 银行账户
 *    1. 查询余额
 *    2. 存款
 *    3. 取款
 *    4. 转账
 *    5. 查询账单
 *
 * 2. 账单类
 *    账号
 *    转账账号
 *    交易时间
 *    交易类型
 *    交易金额
 *
 * 接口(抽象方法)
 *   1. 查询余额
 *   2. 存款
 *   3. 取款
 *   4. 转账
 *   5. 查询账单
 */

public class Test {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(
                "1234567890",
                10000
        );

        start(scanner, bankAccount);
    }

    public static void start (Scanner scanner, BankAccount bankAccount) {
        System.out.println(
                "账户操作\n"
              + "-------------------------\n"
              + "1 - 查询余额\n"
              + "2 - 存款\n"
              + "3 - 取款\n"
              + "4 - 转账\n"
              + "5 - 查询账单"
        );

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                getBalance(scanner, bankAccount);
                break;
            case 2:
                deposit(scanner, bankAccount);
                break;
            case 3:
                withdraw(scanner, bankAccount);
                break;
            case 4:
                transfer(scanner, bankAccount);
                break;
            case 5:
                getBillList(scanner, bankAccount);
                break;
            default:
                break;
        }
    }

    public static void getBalance (Scanner scanner, BankAccount bankAccount) {
        System.out.println("Account number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: " + bankAccount.getBalance());
        start(scanner, bankAccount);
    }

    public static void deposit (Scanner scanner, BankAccount bankAccount) {
        double amount = getInputAmount(scanner);
        bankAccount.deposit(amount);
        start(scanner, bankAccount);
    }

    public static void withdraw (Scanner scanner, BankAccount bankAccount) {
        double amount = getInputAmount(scanner);
        bankAccount.withdraw(amount);
        start(scanner, bankAccount);
    }

    public static void transfer (Scanner scanner, BankAccount bankAccount) {
        String transferAccountNumber = getInputAccountNumber(scanner);
        double amount = getInputAmount(scanner);
        bankAccount.transfer(transferAccountNumber, amount);
        start(scanner, bankAccount);
    }

    public static void getBillList (Scanner scanner, BankAccount bankAccount) {
        bankAccount.getBillList();
        start(scanner, bankAccount);
    }


    private static double getInputAmount (Scanner scanner) {
        System.out.println("Please input amount:");
        double amount =  scanner.nextDouble();
        return amount;
    }

    private static String getInputAccountNumber (Scanner scanner) {
        System.out.println("Please input transfer account number:");
        String transferAccountNumber = scanner.next();
        return transferAccountNumber;
    }
}
