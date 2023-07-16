package com.DesignPattern.static_proxy;

public class ForLoopProxy implements IForLoopWork {
    private final IForLoopWork forLoopWork;

    // 插入类
    public ForLoopProxy (IForLoopWork forLoopWork) {
        this.forLoopWork = forLoopWork;
    }

    @Override
    public void doBigForLoopWork () {
        long forLoopStartAt = System.currentTimeMillis();
        System.out.println("ForLoopProxy: forLoopStartAt = " + forLoopStartAt);
        forLoopWork.doBigForLoopWork();
        long forLoopEndAt = System.currentTimeMillis();
        System.out.println("ForLoopProxy: forLoopEndAt = " + forLoopEndAt);
        long timeSpent = forLoopEndAt - forLoopStartAt;
        System.out.println("ForLoopProxy: timeSpent = " + timeSpent);
    }
}
