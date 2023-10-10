package com.Generics.family;

public class Son extends Father {
    private String name;

    public Son (String name) {
        super(name);
        this.name = name;
    }

    public String getName () {
        return name;
    }
}
