package com.oop_8;

public class ExternalClass2 {
    private static String str = "test";
    // public static InternalClass internalClass = new InternalClass();
//    static class InternalClass {
//        public void test () {
//            System.out.println("--------Internal Class---------");
//            System.out.println("Internal class " + str);
//            ExternalClass2.test();
//            System.out.println("--------Internal Class---------");
//        }
//    }

    /**
     * 为什么静态内部类是推荐的内部类定义方案
     * 1. 不依赖外部类的实例，就不会影响外部类实例引用的解除（防止内存泄露）
     * 2. 也可以不对内部类进行实例化（静态内部类内部都是静态方法）
     * 3. 命名空间的语义化比较完整
     *    ExternalClass.InternalClass.test()
     *    DBManager.DBConnect.test()
     *
     *    import Java.Util.Date
     * 4. 基本上是应用在一个外部类中的工具方法类的定义
     */
    static class InternalClass {
        public static void test () {
            System.out.println("--------Internal Class---------");
            System.out.println("Internal class " + str);
            ExternalClass2.test();
            System.out.println("--------Internal Class---------");
        }
    }

    private static void test () {
        System.out.println("External class " + str);
    }
}
