package com.oop_8;

/**
 * 内部类：Internal class (Inner class)
 * internal 内部的 <-> external 外部的
 * External class
 * <p>
 * 在一个类中（外部类），定义一个类（内部类）
 * <p>
 * 1. 成员内部类：直接在类中定义的类 => 内部类
 * class ExternalClass {
 * class InternalClass {
 * <p>
 * }
 * }
 * <p>
 * 2. 方法内部类：定义在外部类中的成员方法中的类
 * class ExternalClass {
 * public void test () {
 * class InternalClass {
 * <p>
 * }
 * }
 * }
 * <p>
 * 3. 静态内部类： 在外部类内部定义一个静态的内部类 (推荐)
 * class ExternalClass {
 * static class InternalClass {
 * <p>
 * }
 * }
 * <p>
 * 4. 匿名内部类：在外部类的方法中定义没有名字的类
 * 1. 继承匿名内部类
 * 2. 接口匿名内部类
 * 3. 参数匿名内部类
 */

/**
 * 内部类的分类：
 * 类成员内部类：成员属性（成员内部类）、静态成员属性（静态内部类）
 * 方法的内部类：方法内部的具名类（方法内部类）、方法内部的匿名类（匿名内部类）
 *
 * 从实例方面看的分类：
 * 依赖外部类实例：成员内部类、方法内部类、匿名内部类
 * 不依赖外部类实例：静态内部类
 *
 * 为什么推荐静态内部类？
 * 1. 如果不是静态内部类，则需要外部类实例化进行进一步调用
 * 2. 如果外部类需要解除引用的话，要先解除内部类的引用才行
 * 3. 如果内部类的引用依赖于外部类的实例，那么外部类将无法解除引用（释放实例）（内存泄露的理论现象）
 *
 *    因为静态内部类的调用不依赖外部类的实例
 *
 * 内部类到底有什么作用？
 * 1. 解决类中的强封装问题
 *    类中的封装的最小单位 => 方法
 *    类中也可以分任务程序类型进行再一次封装 => 内部类
 *         对方法集合进行再一次的分类继承
 * 2. 解决了Java单继承的继承单薄的问题 => 能够多重继承形成继承链解决单继承问题？
 * class A extends B {
 *     private C c = new C();
 *     void test1 () {
 *         test4();
 *         c.test2();
 *     }
 *     class C extends D {
 *         void test2 () {
 *             test3()
 *         }
 *     }
 * }
 * class B {
 *     void test4 () {}
 * }
 * class D extends E {
 *     void test3 () {}
 * }
 */

public class Test {
    public static void main (String[] args) {
//        ExternalClass externalClass = new ExternalClass();
////        ExternalClass.InternalClass internalClass = externalClass.new InternalClass();
////        internalClass.test();
////        externalClass.test();
//        // externalClass.internalClassTest();
//        externalClass.test("test");

        // ExternalClass2.internalClass.test();
        // ExternalClass2.InternalClass.test();
        ExternalClass3 externalClass3 = new ExternalClass3();
//        externalClass3.test();

        // IInterface interfaceImplementClass = new InterfaceImplementClass();
        // externalClass3.test2(interfaceImplementClass);

        // 参数匿名内部类
//        externalClass3.test2(new IInterface() {
//
//            @Override
//            public void test() {
//                System.out.println("Interface test");
//            }
//        });
    }
}
