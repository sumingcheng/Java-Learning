package com.DesignPattern.static_proxy;

public class ProxyFactory {
    public static IForLoopWork createForLoopWork () {
        IForLoopWork forLoopWork = new ForLoopWork();
        IForLoopWork forLoopProxy = new ForLoopProxy(forLoopWork);
        return forLoopProxy;
    }
}
