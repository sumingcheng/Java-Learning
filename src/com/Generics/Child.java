package com.Generics;

public class Child<T> extends Father<T> {
    public T name;

    public Child (T name) {
        super(name);
    }

    public T getName () {
        return super.getName();
    }

    public void setName (T name) {
        super.setName(name);
    }
}
