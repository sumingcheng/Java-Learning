package com.oop3;

public class IOSPhone extends MobilePhone {
    private static String sytem = "IOS";

    public IOSPhone () {
    }

    public IOSPhone (String cpu, String rom, String ram, String name, String category, double price, String color) {
        super(cpu, rom, ram, name, category, price, color);
        this.sytem = sytem;
    }

    private String getSytem () {
        return sytem;
    }

    private void setSytem (String sytem) {
        this.sytem = sytem;
    }

    public void printInfo () {
        super.printInfo();
        System.out.println("系统：" + sytem);
        System.out.println("--------------------------------------------------");
    }
}
