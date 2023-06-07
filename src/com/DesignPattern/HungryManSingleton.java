package com.DesignPattern;

/*
 * 创建单例的方法
 * 1.构造器私有化
 * 2.类中构造实例
 * 3.提供一个获取实例的方法
 * */
public class HungryManSingleton {
    // 私有的构造器
    private HungryManSingleton () {
    }

    // 给静态属性初始化为本类的实例对象
    private static HungryManSingleton singleton = new HungryManSingleton();

    // 通过静态方法获取实例
    public static HungryManSingleton getInstance () {
        return singleton;
    }

    public void test () {
        System.out.println("test");
    }
}
