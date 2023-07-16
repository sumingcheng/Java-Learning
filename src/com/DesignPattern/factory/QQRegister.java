package com.DesignPattern.factory;

public class QQRegister extends Register {
    public QQRegister () {
    }

    @Override
    void register (String qqNumber, String qqPassword) {
        if (!checkAccount("QQ_NUMBER", qqNumber, qqPassword)) {
            System.out.println("QQ号或密码不能为空");
            return;
        }
        registerAction();
        System.out.println("Register by QQ");
    }

    private void registerAction () {
        System.out.println("QQ注册成功");
    }
}
