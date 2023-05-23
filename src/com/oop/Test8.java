package com.oop;

public class Test8 {
    public static void main (String[] args) {
        Urls urls = new Urls();
        System.out.println(urls.a);
        System.out.println(Urls.b);
        // 静态方法可以使用静态属性
        System.out.println(Urls.test());
    }
}
