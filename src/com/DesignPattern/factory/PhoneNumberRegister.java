package com.DesignPattern.factory;

public class PhoneNumberRegister extends Register {
    public PhoneNumberRegister () {
    }

    @Override
    void register (String phoneNumber, String phonePassword) {
        if (!checkAccount("PHONE_NUMBER", phoneNumber, phonePassword)) {
            System.out.println("手机号或密码不符合要求");
            return;
        }
        registerAction();
        System.out.println("Register by phone number");
    }

    private void registerAction () {
        System.out.println("手机号注册成功");
    }
}
