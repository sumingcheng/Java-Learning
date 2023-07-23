package com.oop_8;

public class ExternalClass {
    private String str = "test";

    private ExternalClass ExternalThis = this;
    private InternalClass internalClass;

    public ExternalClass () {
        internalClass = new InternalClass();
    }

    /**
     * 成员内部类：ExternalClass的成员类
     * 1. 内部类可以访问外部类的所有属性和方法
     * 2. 内部类在变以后，也会生成一个独立的类文件
     * 3. 编译后，内部类的.class文件名：ExternalClass$InternalClass.class
     * 4. 成员内部类，一般不会在外部类的外界进行直接实例化，应该在外部类内部进行实例化
     */
//    public class InternalClass {
//        public void test () {
//            System.out.println("-------Internal--------");
//            System.out.println("Internal Class " + str);
//            ExternalThis.test();
//            System.out.println("-------Internal--------");
//        }
//    }

    private class InternalClass {
        public void test () {
            System.out.println("-------Internal--------");
            System.out.println("Internal Class " + str);
            ExternalThis.test("test");
            System.out.println("-------Internal--------");
        }
    }

    public void internalClassTest () {
        // InternalClass internalClass = new InternalClass();
        internalClass.test();
    }

    public void test (String str1) {
        // 参数可以看作方法内部的局部变量
        // String str1 = "test";
        // str1 存在常量池中，不会被回收
        System.out.println("External Class " + str);

        /**
         * 1. 编译后文件：ExternalClass$1MethodInternalClass.class
         * 2. 方法内部类可以访问到方法的局部变量
         * 3. 方法内部类需要在方法内部进行实例化，然后调用相应方法
         * 4. 方法内部类中使用方法的局部变量，这个变量一定要具备final特性
         *    Java8之前：方法内部的局部变量，如果要用于内部类中，一定要加上final关键字
         *    Java8:    。。。。。。。。。。。。。。。。。。。，变量要具备final特性
         *              如果定义变量时没有使用final关键字，那么编译器将自动加上final关键字
         *              目的：就是为了确定内部类中，不能对变量进行修改
         *              Java8新特性：Effectively final
         */
        class MethodInternalClass {
            public void test () {
                // 变量 'str1' 从内部类中访问，需要为 final 或有效 final
                // str1 += 1;
                System.out.println("Method Internal Class " + str1);
            }
        }

        MethodInternalClass methodInternalClass = new MethodInternalClass();
        methodInternalClass.test();
    }
}
