package com.oop_5;

public class MyInterfaceImpl implements IMyInterface {
    @Override
    public void abstractMethod1 () {
        System.out.println("abstractMethod1");
    }

    @Override
    public void defaultMethod1 () {
        System.out.println("覆盖默认方法");
    }
}
