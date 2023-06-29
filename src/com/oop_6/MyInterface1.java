package com.oop_6;

public interface MyInterface1 {
    public abstract void abstractMethod1 ();

    public abstract void defaultMethod2 ();

    public default void defaultMethod3 () {
        System.out.println("defaultMethod3");
    }
}
