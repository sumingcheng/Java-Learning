package com.wrapper_classs;

public class Test2 {
    public static void main (String[] args) {
        // JDK 1.5 以后自动装箱
        Integer a1 = 996;
        // 打印的时候会调用Integer的toString方法
        System.out.println(a1);
        System.out.println(a1 instanceof Integer);

        // 手动拆箱
        int cc = a1.intValue();
        System.out.println(cc);
        // 拆箱后的cc是基本数据类型，不能调用Integer的方法
    }
}
