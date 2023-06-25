package com.oop_5;

public class Test {
    public static void main (String[] args) {
        MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
        myInterfaceImpl.abstractMethod1();
        // 默认方法可以直接调用
        myInterfaceImpl.defaultMethod1();
        // 静态方法,必须用接口名调用
        IMyInterface.staticMethod1();
    }
}
