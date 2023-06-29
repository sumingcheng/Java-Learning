package com.oop_6;

public interface MyInterface2 {
    public abstract void abstractMethod3 ();

    public abstract void abstractMethod4 ();

    public default void defaultMethod3 () {
        System.out.println("defaultMethod3");
    }
}
