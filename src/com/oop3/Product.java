package com.oop3;

public class Product {
    private String name;
    private String category;
    private double price;
    private String color;

    public Product () {
    }

    public Product (String name, String category, double price, String color) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.color = color;
    }

    protected String getName () {
        return name;
    }

    protected void setName (String name) {
        this.name = name;
    }

    protected String getCategory () {
        return category;
    }

    protected void setCategory (String category) {
        this.category = category;
    }

    protected double getPrice () {
        return price;
    }

    protected void setPrice (double price) {
        this.price = price;
    }

    protected String getColor () {
        return color;
    }

    protected void setColor (String color) {
        this.color = color;
    }

    protected void printInfo () {
        System.out.println("商品名称：" + name + "，商品类别：" + category + "，商品价格：" + price + "，商品颜色：" + color);
    }

}
