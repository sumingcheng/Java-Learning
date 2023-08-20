package com.oop_9;

public class Person {
    public int getHashCode () {
        return this.hashCode();
    }

    protected void finalize () throws Throwable {
        System.out.println("垃圾回收");
    }
}
