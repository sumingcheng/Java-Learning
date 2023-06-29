package com.oop_bank;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;

public class BankAccount implements IAccountManager {
    private String accountNumber;
    private BigDecimal balance;
    private Bill[] billList = new Bill[5];
    private int _length = 0;

    public BankAccount () {}

    public BankAccount (String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = new BigDecimal(balance);
    }

    public String getAccountNumber () {
        return this.accountNumber;
    }

    public double getBalance () {
       return balance.doubleValue();
    }

    public void deposit (double amount) {
        increaseBalance(amount);

        addBill(createBill(
                "",
                "Deposit",
                amount
        ));

        printBalance();
    }

    public void withdraw (double amount) {
        decreaseBalance(amount);

        addBill(createBill(
           "",
           "Withdraw",
           amount
        ));

        printBalance();
    }

    public void transfer (String transferAccountNumber, double amount) {
        decreaseBalance(amount);

        addBill(createBill(
                transferAccountNumber,
                "Transfer",
                amount
        ));

        printBalance();
    }

    public void getBillList () {
        for (Bill bill: billList) {
            if (bill != null) {
                System.out.println(bill.getBill());
            }
        }
    }

    private void increaseBalance (double amount) {
        BigDecimal _amount = new BigDecimal(amount);
        balance = balance.add(_amount);
    }

    private void decreaseBalance (double amount) {
        BigDecimal _amount = new BigDecimal(amount);

        if (balance.compareTo(_amount) == -1) {
            System.out.println("Warn: balance is insufficient.");
            return;
        }

        balance = balance.subtract(_amount);
    }

    private void printBalance () {
        System.out.println("Balance: " + balance);
    }

    /**
     * String accountNumber, x
     * String transferAccountNumber,
     * String dateTime, x
     * String field,
     * double amount
     *
     */
    private Bill createBill (
            String transferAccountNumber,
            String field,
            double amount
    ) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        String dateTime = dateFormat.format(date); // 2023年6月6日 13:28

        return new Bill(
                accountNumber,
                transferAccountNumber,
                dateTime,
                field,
                amount
        );
    }

    private void addBill (Bill bill) {
        if (_length >= billList.length) {
            int _len = billList.length * 2;
            billList = Arrays.copyOf(billList, _len);
        }

        billList[_length ++] = bill;
    }
}
