package com.oop_4;

// 抽象类是不能被实例化的
public abstract class PowerSupply {

    // 类的封装性的核心
    private String category;

    // 类的构造方法
    public PowerSupply () {
    }

    // 类的构造方法
    public PowerSupply (String category) {
        this.category = category;
    }

    // 类的继承的核心
    protected String getCategory () {
        return category;
    }

    // 类的继承的核心
    protected void setCategory (String category) {
        this.category = category;
    }

    // 抽象类的核心
    protected abstract void insert ();

    // 抽象类的核心
    protected abstract void extract ();
}

