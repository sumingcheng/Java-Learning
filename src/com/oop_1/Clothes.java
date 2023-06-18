package com.oop_1;

public class Clothes extends Product {
    private String sort;
    private String size;


    protected Clothes () {
    }

    protected Clothes (String sort, String size, String name, String category, double price, String color) {
        super(name, category, price, color);
        this.sort = sort;
        this.size = size;
    }

    protected String getSort () {
        return sort;
    }

    protected void setSort (String sort) {
        this.sort = sort;
    }

    protected String getSize () {
        return size;
    }

    protected void setSize (String size) {
        this.size = size;
    }

    protected void printInfo () {
        super.printInfo();
        System.out.println("服装类别：" + sort + "，服装尺寸：" + size);
    }
}
