package com.oop_1;

/*
 * IOS 手机 、安卓手机、衣服
 * 1. IOS 手机、安卓手机、衣服都有商品属性
 * 2. 两种手机都属于移动电话
 * 3. 衣服属于服装
 * */
public class Test {
    public static void main (String[] args) {
        IOSPhone iosPhone = new IOSPhone("A13", "256G", "4G", "iPhone 11", "手机", 5999, "黑色");
        iosPhone.printInfo();

        AndroidPhone androidPhone = new AndroidPhone("华为", "麒麟990", "256G", "8G", "Mate 30", "手机", 4999, "黑色");
        androidPhone.printInfo();

        Clothes clothes = new Clothes("T恤", "XL", "T恤", "服装", 199, "白色");
        clothes.printInfo();
    }
}
