package com.oop_3;

public class Male extends Human {
    public Male () {
    }

    public Male (String name) {
        super(name);
    }

    public void travel () {
        System.out.println("Male travels");
    }

    public void work () {
        System.out.println("Male works");
    }

    public void eat () {
        System.out.println("Male eats");
    }

    public void sleep () {
        System.out.println("Male sleeps");
    }
}
