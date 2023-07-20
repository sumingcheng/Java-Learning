package com.DesignPattern.adapert_bill;

import java.util.Date;

public class BillAdapter implements IBillForCloth {
    public BillAdapter () {
    }

    private IBillForElectricity billForElectricity;

    public BillAdapter (IBillForElectricity billForElectricity) {
        this.billForElectricity = billForElectricity;
    }

    @Override
    public void generateBill () {
        billForElectricity.generateBill();
    }
}
