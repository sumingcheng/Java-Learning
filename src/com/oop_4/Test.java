package com.oop_4;

public class Test {

    public static void main (String[] args) {
        ChinesePowerSupply cps = new ChinesePowerSupply("中国");
        BritishPowerSupply bps = new BritishPowerSupply("英国");

        System.out.println(cps.getCategory());
        cps.insert();
        cps.extract();

        System.out.println("-----------------");

        System.out.println(bps.getCategory());
        bps.insert();
        bps.extract();
        bps.britishToChinese();
    }
}
