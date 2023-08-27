package com.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main (String[] args) {
        String str = "Hello World";
        System.out.println(str.hashCode()); // -862545276
        System.out.println(str.length()); // 11
        System.out.println(str.charAt(0)); // H
        System.out.println(str.contains("l")); // true
        System.out.println(str.indexOf("l")); // 2
        System.out.println(str.concat("!!!")); // Hello World!!!,不修改原字符串
        System.out.println(str.endsWith("ld")); // true , 是否以某字符串结尾
        System.out.println(str.lastIndexOf("d")); // 10 ,从后往前找下班
        System.out.println(str.replace(" ", "")); // HelloWorld
        System.out.println(str.toUpperCase()); // HELLO WORLD
        System.out.println(str.toLowerCase()); // hello world
        System.out.println("  996  ".trim()); // 996,去掉首尾空格
        System.out.println(str.substring(0, 5)); // Hello,截取字符串
        System.out.println(str.substring(6)); // World,截取字符串

        String[] arr = str.split("l");
        System.out.println(Arrays.toString(arr)); // [He, , o Wor, d],分割字符串

        System.out.println("abe".compareTo("abc")); // 2,比较字符串大小 ASCII码差值

        System.out.println('e' - 'c');
    }
}
