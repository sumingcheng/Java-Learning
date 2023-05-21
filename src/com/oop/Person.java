package com.oop;

/*
 * 构造器直接在类中定义
 * 构造方法名，必须与类名一致
 * 构造方法不需要进行返回值声明
 * 构造方法一般为 public ，private 一般在单例模式使用
 * 如果没有设置构造方法，编译器默认添加一个无参数的构造方法
 * 如果你自定义了构造方法，系统不会再添加
 * 构造方法不可以有返回值！因为构造方法本身就void
 * 构造方法可以重载的，但是一定要保证参数列表是正确的
 * 从编程的角度来讲，无参数的构造方法，在任何情况下都定义
 * 构造器方法可以通过this调用构造器方法，但是两者不能相互调用，但是必须放在构造方法的第一行调用
 * 构造方法只执行一次，在new的时候执行一次
 * */
public class Person {
    // 成员变量初始化值
    // 在类中进行初始化
//    private String name = "SuMingcheng";
//    private int age = 37;

    private String name;
    private int age;

    // 构造器
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person () {
        this.name = "SuMingcheng";
        this.age = 37;
    }


    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }
}
