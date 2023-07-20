package com.DesignPattern.adapert_bill;

/*
 * 适配器模式
 * 为了解决两个不兼容的接口之间的兼容问题
 * 适配器更多是未来后续的补充，让主函数的逻辑减少，虽然可以使用重载来实现，但是重载的方式不够灵活，而且代码冗余，代码也可能会更多
 * */
public class Test {
    public static void main (String[] args) {
        IBillForCloth billForCloth = new BillForCloth();
        billForCloth.generateBill();

//        IBillForElectricity billForElectricity = new BillForElectricity();
//        billForElectricity.generateBill();

        IBillForElectricity billForElectricity = new BillForElectricity();
        BillAdapter billAdapter = new BillAdapter(billForElectricity);
        generateBill(billAdapter);
    }

    public static void generateBill (IBillForCloth billForCloth) {
        billForCloth.generateBill();
    }
}
