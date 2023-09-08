package com.Generics;

public class ObjectPrinter {
    private Object value;

    public ObjectPrinter (Object value) {
        this.value = value;
    }

    public void print () {
        System.out.println(value);
    }
}
