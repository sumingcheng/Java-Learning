package com.oop_6;


public class MyInterfaceImpl implements MyInterface1, MyInterface2 {
    @Override
    public void abstractMethod1 () {

    }

    @Override
    public void defaultMethod2 () {

    }

    @Override
    public void defaultMethod3 () {
        MyInterface1.super.defaultMethod3();
    }

    @Override
    public void abstractMethod3 () {

    }

    @Override
    public void abstractMethod4 () {

    }
    /*
     * 1. 一个类有且只能有一个父类，但是可以实现多个接口
     * 2. 一个类如果没有extends，那么默认继承Object类
     * 3. 一个类可以实现多个接口，接口之间用逗号隔开
     * 4. 实现类必须实现接口的所有抽象方法，有多个相同的抽象方法，只需要实现一次
     * 5. 实现类如果是抽象类，那么不需要实现接口的抽象方法
     * 6. 如果具体类继承的抽象类已经实现类接口的抽象方法，那么具体类可以不实现接口的抽象方法
     * */

}
