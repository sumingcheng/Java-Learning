package com.DesignPattern.template_method;

import java.util.Scanner;

public class AdminController extends APIManager {
    private String UserName;
    private String Password;

    private final Scanner scanner = new Scanner(System.in);

    public AdminController () {
    }

    @Override
    protected boolean loginAction () {
        System.out.println("请输入用户名：");
        this.UserName = scanner.next();
        System.out.println("请输入密码：");
        this.Password = scanner.next();

        return this.UserName.equals("admin") && this.Password.equals("123456");
    }

    @Override
    protected void callAPI (String apiName) {
        switch (apiName) {
            case "getUserInfo" -> getUserInfo();
            case "getUserLikes" -> getUserLikes();
            case "getUserFlloing" -> getUserFlloing();
            default -> System.out.println("apiName 不存在");
        }
    }

    private void getUserInfo () {
        System.out.println("获取用户信息 success");
    }

    private void getUserLikes () {
        System.out.println("获取用户喜欢 success");
    }

    private void getUserFlloing () {
        System.out.println("获取用户关注 success");
    }
}
