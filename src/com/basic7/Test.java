package com.basic7;

/*
 * 方法
 * */


public class Test {
    public static void main(String[] args) {
        // 实参 1, 2
        String str = add(1, 2);
        System.out.println(str);
    }

    // 形参 a, b ,必须定义类型
    public static String add(Number a, Number b) {
        int c = a.intValue() + b.intValue();
        return String.valueOf(c);
    }
}
