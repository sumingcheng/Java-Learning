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

    // 私有方法
    /*
     * 1. Java 8 新增的特性
     * 2. Java 9 支持静态方法的私有化
     * 3. 接口的私有方法：提供给默认方法或静态方法调用，但是写法不同
     * 4. 接口内部的方法可以使用，不能被外部调用
     * 5. private 不能省略
     * */

    public default void defaultMethod2 () {
        privateMethod1("私有方法1");
        System.out.println("defaultMethod2");
    }

    public default void defaultMethod3 () {
        privateMethod1("私有方法2");
        System.out.println("defaultMethod3");
    }

    private void privateMethod1 (String Content) {
        System.out.println(Content);
    }

    // 接口常量 (public static final) 接口不是类，没有构造方法
    /*
     * 1. 常量必须是公开的
     * 2. 定义时必须赋值
     * 3. 常量名必须大写
     * 4. 实现类可以直接继承接口常量
     * 5. 常量可以在有方法体的方法中使用
     * */

    // 省略写法
    public static final String CONSTANT1 = "常量1";
    static final String CONSTANT2 = "常量2";
    final String CONSTANT4 = "常量4";
    String CONSTANT3 = "常量3";

    // 静态代码块
    /*
     * 1. 接口里不允许有静态代码块
     * */

    // 构造方法
    /*
     * 1. 接口里不允许有构造方法
     * */
}
