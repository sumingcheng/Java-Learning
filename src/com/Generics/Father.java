package com.Generics;

public class Father<T> {
    public T name;

    public Father (T name) {
        this.name = name;
    }

    public T getName () {
        return name;
    }

    public void setName (T name) {
        this.name = name;
    }
}
