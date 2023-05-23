package com.oop;

public class Urls {
    public int a = 1;
    public static int b = 2;

    public static int test () {
        return b;
        // 无法从 static 上下文引用非 static 字段 'a'
        // return a;
    }

}
