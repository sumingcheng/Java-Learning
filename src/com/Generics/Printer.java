package com.Generics;

public class Printer<T, K> {
    T value;
    K value1;

    public Printer (T value, K value1) {
        this.value = value;
        this.value1 = value1;
    }

    public T print () {
        System.out.println(value);
        System.out.println(value1);

        return value;
    }

}
