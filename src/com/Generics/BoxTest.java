package com.Generics;

public class BoxTest {
    public static void main (String[] args) {
        Box genericBox = new Box();    // 不指定泛型类型，默认为Object
        genericBox.setValue("Hello");  // 可以存储任何类型的对象
        genericBox.setValue(123);      // 也可以存储一个int

        Object genericValue = genericBox.getValue();  // 返回值类型为Object
        System.out.println(genericValue);

        Box<Integer> intBox = new Box<>();
        intBox.setValue(42);           // 自动装箱：将int转换为Integer

        int intValue = intBox.getValue(); // 自动拆箱：将Integer转换为int
        System.out.println(intValue);

    }
}
