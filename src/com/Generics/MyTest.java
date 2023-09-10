package com.Generics;

/*
 * 泛型
 *
 * */
public class MyTest<T, E> {
    private T value;

    public MyTest (T value) {
        this.value = value;
    }

    public void printType () {
        System.out.println(value.getClass().getName());
    }
}
