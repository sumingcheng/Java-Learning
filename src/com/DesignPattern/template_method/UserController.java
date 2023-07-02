package com.DesignPattern.template_method;

import java.util.Scanner;

public class UserController {
    private String UserName;
    private String Password;

    private final Scanner scanner = new Scanner(System.in);

    public UserController () {

    }

    private boolean loginAction () {
        System.out.println("请输入用户名：");
        this.UserName = scanner.next();
        System.out.println("请输入密码：");
        this.Password = scanner.next();

        return this.UserName.equals("admin") && this.Password.equals("123456");
    }

    public void getUserInfo () {
        if (loginAction()) {
            System.out.println("获取用户信息");
        } else {
            getUserInfo();
        }
    }

    public void getUserLikes () {
        if (loginAction()) {
            System.out.println("获取用户喜欢");
        } else {
            getUserLikes();
        }
    }

    public void getUserFlloing () {
        if (loginAction()) {
            System.out.println("获取用户关注");
        } else {
            getUserFlloing();
        }
    }
}
