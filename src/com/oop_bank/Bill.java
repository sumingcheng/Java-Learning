package com.oop_bank;

public class Bill {
    private String accountNumber;
    private String transferAccountNumber;
    private String dateTime;
    private String field;
    private double amount;

    public Bill () {}

    public Bill (
            String accountNumber,
            String transferAccountNumber,
            String dateTime,
            String field,
            double amount
    ) {
        this.accountNumber = accountNumber;
        this.transferAccountNumber = transferAccountNumber;
        this.dateTime = dateTime;
        this.field = field;
        this.amount = amount;
    }

    public String getBill () {
        return "------------------------------------------\n"
             + "accountNumber: " + accountNumber + ",\n"
             + "transferAccountNumber: " + transferAccountNumber + ",\n"
             + "dateTime: " + dateTime + ",\n"
             + "field: " + field + ",\n"
             + "amount: " + amount + ",\n"
             + "------------------------------------------\n";
    }
}
