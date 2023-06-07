package com.DesignPattern;

/*
 * 单例模式
 * */
public class Test {
    public static void main (String[] args) {
        HungryManSingleton singleton1 = HungryManSingleton.getInstance();
        HungryManSingleton singleton2 = HungryManSingleton.getInstance();
        System.out.println(singleton1 == singleton2); // true
    }
}
