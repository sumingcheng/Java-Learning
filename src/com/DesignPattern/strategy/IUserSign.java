package com.DesignPattern.strategy;

public interface IUserSign {
    void login(String account, String passcode);
    void register(String account, String password);
}
