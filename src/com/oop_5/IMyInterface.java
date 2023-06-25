package com.oop_5;

public interface IMyInterface {
    // 抽象方法
    /*
     * 1. 抽象方法不能有方法体
     * 2. 抽象方法必须在抽象类或接口中
     * 3. 抽象方法必须是公开的，因为抽象方法必须在子类中实现
     * 4. 可以不写 public abstract，因为抽象方法默认就是 public abstract
     * */
    public abstract void abstractMethod1 ();

    // 默认方法
    /*
     * 1. 默认方法不需要实现类
     * 2. 如果实现类实现了接口，那么默认方法被覆盖
     * 3. 必须是公开的
     * 4. 必须有default关键字
     *
     * 作用：扩展接口的时候，让实现类也可以正常编译
     * */
    public default void defaultMethod1 () {
        System.out.println("defaultMethod1");
    }

    // 静态方法
    /*
     * 1. 是接口的静态方法，实现类是无法调用的，必须用接口名调用
     * 2. 必须是公开的
     * 3. 必须有static关键字，public 可以省略
     * 4. 必须是静态的
     * */
    public static void staticMethod1 () {
        System.out.println("staticMethod1");
    }


}
