package com.oop_9;

public class Test {
    public static void main (String[] args) {
        Person person = new Person();
        // com.oop_9.Person@4eec7777
        System.out.println(person.toString());
        // class com.oop_9.Person
        System.out.println(person.getClass());
        // com.oop_9.Person
        System.out.println(person.getClass().getName());
        // 1324119927
        System.out.println(person.hashCode());
        // 4eec7777
        System.out.println(Integer.toHexString(1324119927));

        Person person2 = new Person();
        // equals 判断两个对象是否相等
        System.out.println(person.equals(person2));
        // == 判断两个对象的内存地址是否相等
        System.out.println(person == person2);

        String str1 = "sumingcheng";
        String str2 = "sumingcheng";

        // 如果字符串的内容相同，true
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str2); // true

        String str3 = new String("sumingcheng");
        String str4 = new String("sumingcheng");

        // equals 如果字符串的内容相同，true
        System.out.println(str3.equals(str4)); // true
        // 如果不是字面量字符串，而是实例化字符串对象，那么等号判断的引用地址
        System.out.println(str3 == str4); // false

        // gc
        Person person3 = new Person();
        person3 = null;
        System.gc();
    }
}
