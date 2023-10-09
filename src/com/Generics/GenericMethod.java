package com.Generics;

public class GenericMethod {

//    public <T, E> boolean myEquals (T a, E b) {
//        return a.equals(b);
//    }
//
//    public static <T, E> boolean myEquals1 (T a, E b) {
//        return a.equals(b);
//    }

    public static <T> void getType (T... value) {
        for (T t : value) {
            System.out.print(t+":");
            System.out.println(t.getClass().getName());
        }
    }
}
