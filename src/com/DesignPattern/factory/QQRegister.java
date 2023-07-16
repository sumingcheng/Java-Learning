package com.DesignPattern.factory;

public class QQRegister extends Register {
    public QQRegister () {
    }

    @Override
    void register (String qqNumber, String qqPassword) {
        if (qqNumber == null || qqPassword == null) {
            System.out.println("QQ或密码不能为空");
            return;
        }
        registerAction();
        System.out.println("Register by QQ");
    }

    void registerAction () {
        System.out.println("QQ注册成功");
    }
}
