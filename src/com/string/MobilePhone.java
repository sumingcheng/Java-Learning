package com.string;

public class MobilePhone {
    private String productName;
    private float price;
    private String color;

    public MobilePhone () {
    }

    public MobilePhone (
            String productName,
            float price,
            String color
    ) {
        this.productName = productName;
        this.price = price;
        this.color = color;
    }

    public String toString () {
        return "[product_name=" + productName + "," +
                "price=" + price + "," +
                "color=" + color +
                "]";
    }
}
