package com.DesignPattern.factory;

public class Test {
    public static void main (String[] args) {
        Register QQRegister = Factory.register("QQ_NUMBER");
        QQRegister.register("1234567890", "123456");

        Register phoneNumberRegister = Factory.register("PHONE_NUMBER");
        phoneNumberRegister.register("12345678901", "123456");

        Register usernameRegister = Factory.register("USERNAME");
        usernameRegister.register("123456", "123456");
    }
}
