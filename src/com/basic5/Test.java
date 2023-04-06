package com.basic5;

public class Test {
    private static boolean isLogin = true;

    public static void main(String[] args) {
        if (isLogin) {
            System.out.println("Login Success");
        } else {
            System.out.println("Login Failed");
        }
    }
}
