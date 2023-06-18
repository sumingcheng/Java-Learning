package com.oop_3;

public abstract class Human extends Animal {
    public Human () {
    }

    public Human (String name) {
        this.name = name;
    }
    public abstract void work ();

    public abstract void travel ();

    public void printName () {
        System.out.println("My name is " + name);
    }
}
