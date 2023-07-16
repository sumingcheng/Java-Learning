package com.DesignPattern.strategy;

public class MobilePhoneNumberSign implements IUserSign {
    @Override
    public void login (String account, String passcode) {
        if (account.length() != 11) {
            System.out.println("手机号长度不正确");
            return;
        }

        if (!passcode.equals("1234")) {
            System.out.println("验证码不正确");
            return;
        }

        System.out.println("登录成功");
    }

    @Override
    public void register (String account, String password) {

    }
}
