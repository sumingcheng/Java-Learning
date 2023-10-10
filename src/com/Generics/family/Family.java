package com.Generics.family;

public class Family<T> {
    private T person;

    public Family (T person) {
        this.person = person;
    }

    public T getPerson () {
        return person;
    }
}
