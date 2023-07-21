package com.oop_8;

public class Test {
    public static void main (String[] args) {
        ExternalClass externalClass = new ExternalClass();
//        externalClass.test();

        // new　内部类
        ExternalClass.InternalClass internalClass = externalClass.new InternalClass();
        internalClass.test();
    }
}
