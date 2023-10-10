package com.Generics.family;

public class Father extends Grandpa {
    private String name;

    public Father (String name) {
        super(name);
        this.name = name;
    }

    public String getName () {
        return name;
    }
}
