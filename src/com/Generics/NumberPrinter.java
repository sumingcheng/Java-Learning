package com.Generics;

public class NumberPrinter<T extends Number> {
    private T value;

    public NumberPrinter (T value) {
        this.value = value;
    }

    public void print () {
        System.out.println(value);
    }
}
