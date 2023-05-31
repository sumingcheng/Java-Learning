package com.oop;

public class Test13 {
    public static void main (String[] args) {
        JavaClass javaClass = new JavaClass(5);
        javaClass.push(new JavaStudent(1, "张三", 18, true));
        javaClass.push(new JavaStudent(2, "李四", 19, false));
        javaClass.push(new JavaStudent(3, "王五", 20, true));
        javaClass.push(new JavaStudent(4, "赵六", 21, false));
        javaClass.push(new JavaStudent(5, "田七", 22, true));


        System.out.println(javaClass.push(new JavaStudent(6, "小明", 22, true)));
        System.out.println(javaClass.push(new JavaStudent(7, "田七", 22, true)));
        System.out.println(javaClass.push(new JavaStudent(8, "田七", 22, true)));
        System.out.println(javaClass.push(new JavaStudent(9, "黑盒", 22, true)));

        System.out.println(javaClass.getJavaClass());
        System.out.println("====================================");
        JavaStudent student = javaClass.find(5)[0];
        System.out.println(student.getStudent());

        System.out.println("====================================");

        javaClass.update((new JavaStudent(5, "牛逼王", 22, true)));
        System.out.println(student.getStudent());

        System.out.println("====================================");
        javaClass.delete(3);
        System.out.println(javaClass.getJavaClass());
    }
}
