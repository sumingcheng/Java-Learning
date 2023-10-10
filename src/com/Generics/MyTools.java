package com.Generics;

public class MyTools<T> {
    private final T value;

    public MyTools (T value) {
        this.value = value;
    }

    public T getValue () {
        return value;
    }

    public void getType () {
        System.out.printf(value.getClass().getSimpleName());
    }
}
