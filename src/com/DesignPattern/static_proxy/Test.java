package com.DesignPattern.static_proxy;

public class Test {
    public static void main (String[] args) {
//        IForLoopWork forLoopWork = new ForLoopWork();
//        IForLoopWork forLoopProxy = new ForLoopProxy(forLoopWork);
        IForLoopWork forLoopProxy = ProxyFactory.createForLoopWork();
        forLoopProxy.doBigForLoopWork();
    }
}
