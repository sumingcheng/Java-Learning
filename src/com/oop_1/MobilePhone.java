package com.oop_1;

public class MobilePhone extends Product {
    private String cpu;
    private String rom;
    private String ram;

    protected MobilePhone () {
    }

    protected MobilePhone (String cpu, String rom, String ram, String name, String category, double price, String color) {
        super(name, category, price, color);
        this.cpu = cpu;
        this.rom = rom;
        this.ram = ram;
    }

    protected String getCpu () {
        return cpu;
    }

    protected void setCpu (String cpu) {
        this.cpu = cpu;
    }

    protected String getRom () {
        return rom;
    }

    protected void setRom (String rom) {
        this.rom = rom;
    }

    protected String getRam () {
        return ram;
    }

    protected void setRam (String ram) {
        this.ram = ram;
    }

    protected void printInfo () {
        super.printInfo();
        System.out.println("CPU：" + cpu + "，ROM：" + rom + "，RAM：" + ram);
    }

}
