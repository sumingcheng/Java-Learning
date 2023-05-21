package com.oop;

public class Test {
    public static void main (String[] args) {
        Test t = new Test();  // 创建Test对象
        t.Test();             // 调用Test方法
    }

    private String brand;
    private String color;
    private int price;

    public void Test () {
        int price = 200;
        System.out.println(price);
        System.out.println(this.price);
    }

    // 成员方法访问成员变量，可以不用this
    public String getBrand () {
        return brand;
    }

    // 在成员方法内，操作成员变量，必须先通过this访问成员变量
    public String setBrand (String brand) {
        return this.brand = brand;
    }

    public String getColor () {
        return color;
    }

    public String setColor (String color) {
        return this.color = color;
    }

    public int getPrice () {
        return price;
    }

    public int setPrice (int price) {
        return this.price = price;
    }


}
