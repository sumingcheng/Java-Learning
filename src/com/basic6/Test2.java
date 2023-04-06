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
            System.out.println("Please enter your username: ");
            _userName = scanner.next();
        } while (!_userName.equals(userName));

        do {
            System.out.println("Please enter your password: ");
            _password = scanner.next();
        } while (!_password.equals(password));

        System.out.println("Login successfully!");
    }
}
