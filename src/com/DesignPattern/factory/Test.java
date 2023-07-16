package com.DesignPattern.factory;

public class Test {
    public static void main (String[] args) {
        Register register = new UsernameRegister();
        register.register("username", "password");

        register = new PhoneNumberRegister();
        register.register("phoneNumber", "phonePassword");

        register = new QQRegister();
        register.register("qqNumber", "qqPassword");
    }
}
