package com.DesignPattern.factory;

public class UsernameRegister extends Register {
    public UsernameRegister () {
    }

    @Override
    void register (String username, String password) {
        if (username == null || password == null) {
            System.out.println("用户名或密码不能为空");
            return;
        }
        registerAction();
        System.out.println("Register by username");
    }

    void registerAction () {
        System.out.println("用户名注册成功");
    }
}
