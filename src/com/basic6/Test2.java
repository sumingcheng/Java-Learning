package com.basic6;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String userName = "admin";
        String password = "123456";
        Scanner scanner = new Scanner(System.in);
        String _userName;
        String _password;

        do {
            System.out.println("请输入用户名：");
            _userName = scanner.next();
        } while (!_userName.equals(userName));

        do {
            System.out.println("请输入密码：");
            _password = scanner.next();
        } while (!_password.equals(password));

    }
}
