package com.DesignPattern.factory;

public class UsernameRegister extends Register {
    public UsernameRegister () {
    }

    @Override
    void register (String username, String password) {
        if (!checkAccount("USERNAME", username, password)) {
            System.out.println("用户名或密码不符合要求");
            return;
        }
        registerAction();
        System.out.println("Register by username");
    }

    private void registerAction () {
        System.out.println("用户名注册成功");
    }
}
