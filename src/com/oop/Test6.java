package com.oop;

public class Test6 {
    public static void main (String[] args) {
        Person person1 = new Person("Sumingcheng", 18);
        Person person2 = new Person();
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
    }
}
