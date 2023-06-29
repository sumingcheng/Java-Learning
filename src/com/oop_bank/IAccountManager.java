package com.oop_bank;

public interface IAccountManager {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
    void transfer(String transferAccountNumber, double amount);
    void getBillList();
}
