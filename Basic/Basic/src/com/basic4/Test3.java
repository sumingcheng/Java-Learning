package com.basic4;

// 浮点数运算
public class Test3 {
    public static void main(String[] args) {
        /*
         * 2.5f - 0.5 => 2.0 ?
         * 2.5 整数部分 2
         * 2/2 = 1 余数 0
         * 1/2 = 0 余数 1
         * => 10
         *
         * 2.5 小数部分 0.5
         * 0.5 * 2 = 1 | 1
         * => 1
         *
         * 2.5 => 10.1
         * 规范化写法
         * 符号位：s => 0
         * 有效数字：M => 1.010000000000000000000
         * 指数位：E => 1
         *
         * v => (-1)^s * M * 2^E
         * v => (-1)^0 * 1.010000000000000000000 * 2^1
         * */

        /*
        * 0.5 小数部分 0.5
        * 0.5 * 2 = 1 | 1
        * => 1
        * 0.5 => 0.1
        *
        * 规范化写法
        * 符号位：s => 0
        * 有效数字：M => 1.000000000000000000000
        * 指数位：E => -1
        * v => (-1)^s * M * 2^E
        * v => (-1)^0 * 1.000000000000000000000 * 2^-1
        * */

        /*
        * 相减
        * 1.指数小同大、
        * v => (-1)^0 * 1.010000000000000000000 * 2^1
        * v => (-1)^0 * 1.000000000000000000000 * 2^-1 变成指数相同的再相减
        * v => (-1)^0 * 0.010000000000000000000 * 2^1
        * 2.运算
        * v => (-1)^0 * 1.000000000000000000000 * 2^1
        * */

        System.out.println(2.5f - 0.5); // 2.0
        /*
        * 2.0 整数部分 2
        * 2/2 = 1 余数 0
        * 1/2 = 0 余数 1
        * 10
        * 2.0 小数部分 0.0
        * 0.0 * 2 = 0 | 0
        * 0.0 => 0
        *
        * 规范化写法
        * 符号位：s => 0
        * 有效数字：M => 1.000000000000000000000
        * 指数位：E => 1
        * v => (-1)^s * M * 2^E
        * 值
        * v => (-1)^0 * 1.000000000000000000000 * 2^1
        * 答案
        * v => (-1)^0 * 1.000000000000000000000 * 2^1
        * */
    }
}
