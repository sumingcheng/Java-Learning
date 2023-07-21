package com.oop_8;

public class ExternalClass {
    private final String name = "ExternalClass";
    private final ExternalClass externalClass = this;

    public class InternalClass {
        public void test () {
            System.out.println(name);
            externalClass.test();
        }
    }

    public void test () {
        System.out.println("Test");
    }
}
