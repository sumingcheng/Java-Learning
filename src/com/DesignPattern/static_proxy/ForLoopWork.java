package com.DesignPattern.static_proxy;

public class ForLoopWork implements IForLoopWork {
    public ForLoopWork () {
    }

    @Override
    public void doBigForLoopWork () {
        for (int i = 0; i < 1000; i++) {
            System.out.println("ForLoopWork: i = " + i);
        }
    }

}
