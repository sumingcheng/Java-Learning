package com.oop_2;

public class Person {
    private String name;
    private int age;
    public int height = 180;

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public void testPerson () {
        System.out.println("I am Person Class");
    }
}
