package com.random;

import java.util.Random;

public class Test {
    public static void main (String[] args) {
        Random random = new Random();
        // 取值范围 0.0 <= x < 1.0 之间的伪随机 double 值
        System.out.println(Math.random());
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextInt());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextLong());

        // 限定范围 参数 ：seed 种子数
        Random random1 = new Random(66);
        Random random2 = new Random(66);
        System.out.println(random1.nextInt(100)); // 44
        System.out.println("————————————————————————————");
        System.out.println(random2.nextInt(100)); // 44
    }
}
