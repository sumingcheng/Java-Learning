package com.basic4;

public class Test {
    public static void main(String[] args) {
        // 赋值运算
//        int a = 10;
        /*
         * 1.创建一个名字为a的，int类型的内存空间
         * 2.将10存储到给这个a这个内存空间
         * */

//        int b = a + 1; // 二元运算符
//
//        a += 1; // 一元运算符

//        int a = 10, b = 20;
//        // 不兼容的类型: 从float转换到int可能会有损失
//        a = (float) a / (float) b;
//
//        System.out.println(a);

//        byte a = 1;
//        byte b = 2;
//        // 二元运算 会自动转换为int类型
//        a = (byte)(a + b);
//        System.out.println(a);
//        // 一元运算 不会自动转换
//        a += b;
//        System.out.println(a);

//        int a = 1;
//        int b = 2;

//
//        // 如果没有f或F，编译器会将其识别为double类型。
//        float c = 1.1f;
//        double d = 1.0;
//        System.out.println(a > c); // false
//        System.out.println(d == a); // true
//        System.out.println(c > d); // true
//        System.out.println(c > b); // false
//        System.out.println(a >= d); // true


//        int b = 2;
//        float c = 1.1f;
//        char e = 'a';
//
//        System.out.println(b < e); // true
//        System.out.println(c < e); // true


//        String c = "abc";
//        String d = "abc";
//        String b = "ccc";
//        System.out.println(c == d); // true
//        System.out.println(b == d); // false

//        char h = '1';
//        int a = 1;
//        System.out.println(h == a); // false

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
    }
}
