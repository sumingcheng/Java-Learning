package com.runtime;

public class Test {
    public static void main (String[] args) {
        Runtime runtime = Runtime.getRuntime();
        // 获取当前电脑的 CPU 核数
        System.out.println(runtime.availableProcessors());
        // 空闲内存，多少内存是空闲内存
        System.out.println(runtime.freeMemory());
        // 获取Java能够使用的最大内存
        System.out.println(runtime.totalMemory());
        // 最大内存，Java能从系统中分配到的最大内存
        System.out.println(runtime.maxMemory());
    }
}
