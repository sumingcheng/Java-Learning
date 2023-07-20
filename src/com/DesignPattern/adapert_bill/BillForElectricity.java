package com.DesignPattern.adapert_bill;

import java.util.Date;

public class BillForElectricity implements IBillForElectricity {

    @Override
    public void generateBill () {
        String bill = "电费账单";
        int money = 999;
        Date dataTime = new Date();

        System.out.println(
                "账单：" + bill + "\n" +
                        "金额：" + money + "\n" +
                        "消费时间时间：" + dataTime + "\n"
        );
    }
}
