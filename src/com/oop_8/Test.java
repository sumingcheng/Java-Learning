package com.oop_8;

public class Test {
    public static void main (String[] args) {
        ExternalClass externalClass = new ExternalClass();
//        externalClass.test();

        // new　内部类
        ExternalClass.InnernalClass innernalClass = externalClass.new InnernalClass();
        innernalClass.test();
    }
}
