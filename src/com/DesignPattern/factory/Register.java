package com.DesignPattern.factory;

abstract class Register {
    public Register () {
    }


    protected Boolean checkAccount (String type, String account, String password) {
        return switch (type) {
            case "QQ_NUMBER" -> account.length() >= 10 && password.length() >= 6;
            case "PHONE_NUMBER" -> account.length() >= 11 && password.length() >= 6;
            case "USERNAME" -> account.length() >= 6 && password.length() >= 6;
            default -> false;
        };
    }

    abstract void register (String account, String password);
}
