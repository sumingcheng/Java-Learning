package com.oop_1;

public class AndroidPhone extends MobilePhone {
    private static String system = "Android";
    private String brand;

    public AndroidPhone () {
    }

    public AndroidPhone (String brand, String cpu, String rom, String ram, String name, String category, double price, String color) {
        super(cpu, rom, ram, name, category, price, color);
        this.brand = brand;
    }

    private String getSystem () {
        return system;
    }

    private void setSystem (String system) {
        this.system = system;
    }

    private String getBrand () {
        return brand;
    }

    private void setBrand (String brand) {
        this.brand = brand;
    }

    public void printInfo () {
        super.printInfo();
        System.out.println("系统：" + system + "，品牌：" + brand);
        System.out.println("--------------------------------------------------");
    }
}
