    package com.oop;

    public class CodeBlock {
        {
            // new 的时候会执行构造代码块
            System.out.println("构造代码块");
        }

        static {
            // 类加载的时候会执行静态代码块
            // 无论实例化多少次，静态代码块只会执行一次
            String name = "静态代码块";
            System.out.println(name);
        }

        public CodeBlock () {
            System.out.println("构造方法");
            test();
        }

        public static void test () {
            String testName = "test";
            {
                String name = "普通代码块";
                System.out.println(name);
                System.out.println(testName);
            }
            // 无法解析符号 'name'
            // System.out.println(name);

            Person myTest = new Person();

            synchronized (myTest) {
                System.out.println("同步代码块");
            }
        }
    }
