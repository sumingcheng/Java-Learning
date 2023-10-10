package com.Generics.family;

public class Test {
    public static void main (String[] args) {
        Grandpa grandpa = new Grandpa("Mike");
        Father father = new Father("Joe");
        Son son = new Son("Eric");
        Family<Grandpa> familyGrandpa = new Family<>(grandpa);
        printName(familyGrandpa);
        Family<Father> familyFather = new Family<>(father);
        printName(familyFather);
//        Family<Son> familySon = new Family<>(son);
//        printName(familySon);
    }

    // 上限
//    public static void printName (Family<? extends Grandpa> family) {
//        Grandpa person = family.getPerson();
//        System.out.println(person.getName());
//    }
    // 下限
    public static void printName (Family<? super Father> family) {
        Object person = family.getPerson();
//        System.out.println(person.getName());
    }
}
