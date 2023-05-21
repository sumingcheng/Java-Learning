package com.basic9;

/*
 * 类
 * */
public class Test {
    public static void main (String[] args) {
        /*
         * 实例化对象
         * */
//        Calculator calculator = new Calculator();

//        System.out.println(calculator.add());
//        System.out.println(calculator.minus());
//        System.out.println(calculator.div());
//        System.out.println(calculator.mul());

        /*
         * 对象没有被变量接收，完成工作后会被垃圾收回
         * 该对象是一个匿名对象
         * */
        System.out.println(new Calculator().add());

        // 主动释放对象
        Calculator calculator = new Calculator();

        /*
        * java默认继承Object 每次sout的时候都会调用tostring
        * */
        System.out.println(calculator);
    }
}
