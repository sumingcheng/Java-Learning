package com.DesignPattern.factory;

public class Factory {
    public static Register register (String type) {
        return switch (type) {
            case "QQ_NUMBER" -> new QQRegister();
            case "PHONE_NUMBER" -> new PhoneNumberRegister();
            case "USERNAME" -> new UsernameRegister();
            default -> null;
        };
    }
}
