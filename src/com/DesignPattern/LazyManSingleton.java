package com.DesignPattern;

public class LazyManSingleton {
    private LazyManSingleton () {
    }

    private int a;
    private int b;

    private LazyManSingleton (int a, int b) {
        this.a = a;
        this.b = b;
    }

    private static LazyManSingleton singleton;

    public static LazyManSingleton getInstance (int a, int b) {
        if (singleton == null) {
            singleton = new LazyManSingleton(a, b);
        }
        return singleton;
    }

    public static LazyManSingleton getInstance () {
        if (singleton == null) {
            singleton = new LazyManSingleton();
        }
        return singleton;
    }

    public void test () {
        System.out.println("懒汉模式" +(a + b));
    }
}
