package com.big_number;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {
    public static void main (String[] args) {
        long l = Long.MAX_VALUE;
        System.out.println(l);
        // BigInteger 用于整数运算,更大的整数值
        BigInteger bigInteger = new BigInteger("12345678901234567890");


        double d = Double.MAX_VALUE;
        System.out.println(d);
        // BigDecimal 用于浮点数运算，更高的精度
        BigDecimal bi1 = new BigDecimal("0.1");
        BigDecimal bi2 = new BigDecimal("0.2");
        BigDecimal bi3 = new BigDecimal("0.1");

        System.out.println(bi1.compareTo(bi2)); // -1 小于返回 -1
        System.out.println(bi2.compareTo(bi1)); // 1  大于返回 1
        System.out.println(bi1.compareTo(bi3)); // 0 等于返回 0
        System.out.println(bi1.equals(bi3)); // true
    }
}
