package com.DesignPattern.factory;

public class PhoneNumberRegister extends Register {
    public PhoneNumberRegister () {
    }

    @Override
    void register (String phoneNumber, String phonePassword) {
        if (phoneNumber == null || phonePassword == null) {
            System.out.println("手机号或密码不能为空");
            return;
        }
        registerAction();
        System.out.println("Register by phone number");
    }

    void registerAction () {
        System.out.println("手机号注册成功");
    }
}
