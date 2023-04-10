package com.basic2;

public class Test3 {
    public static void main(String[] args) {
        final int WEEK_DAY_COUNT = 7;
        final String STR = "字符串";
        // 常量之间是可以计算的
        final int A = 1;
        final int B = 2;
        final int C = A + B;
        System.out.println(C);
        // 常量和变量的结果可以给常量赋值，但是只能赋值一次
        final int AA = 1;
        int BB = 2;
        final int CC = AA * BB;
        System.out.println(CC);
        // 字符串可以赋值给常量
        String SS = "SS";
        final String SAB = SS + AA + BB;
        System.out.println(SAB);
    }
}
