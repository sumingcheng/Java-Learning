package com.DesignPattern.adapert_bill;

import java.util.Date;

public class BillForCloth implements IBillForCloth {
    @Override
    public void generateBill () {
        String category = "cloth";
        int price = 100;
        Date dataTime = new Date();
        System.out.println(
                "种类：" + category + "\n" +
                        "价格：" + price + "\n" +
                        "消费时间时间：" + dataTime + "\n"
        );
    }
}
