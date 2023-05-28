package com.oop;

public class UserClass {
    private String name;
    private int order;

    public UserClass () {
    }

    public UserClass (String name, int order) {
        this.name = name;
        this.order = order;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setOrder (int order) {
        this.order = order;
    }

    public int getOrder () {
        return order;
    }
}
