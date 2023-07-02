package com.DesignPattern.singleton;

/*
 * 单例模式
 * */
public class Test {
    public static void main (String[] args) {
        // 饿汉模式 类加载时就创建对象
        HungryManSingleton singleton1 = HungryManSingleton.getInstance();
        HungryManSingleton singleton2 = HungryManSingleton.getInstance();
        System.out.println(singleton1 == singleton2); // true

        // 懒汉模式 类加载时不创建对象
        LazyManSingleton singleton3 = LazyManSingleton.getInstance(1, 2);
        LazyManSingleton singleton4 = LazyManSingleton.getInstance(3, 4);
        System.out.println(singleton3 == singleton4); // true

        singleton3.test();
        singleton4.test();

//        StaticSingleton singleton5 = new StaticSingleton();
    }
}
