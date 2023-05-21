package com.oop;

import java.util.Arrays;

/**
 * {
 * { "张三", "广东" }
 * }
 */

public class MyClasses {
    private String[][] javaClass = {{"张三", "广东"}, {"李四", "四川"}, {"王五", "河南"}};

    private String[][] frontendClass = {{"张三", "北京"}, {"赵六", "安徽"}, {"李四", "四川"}, {"王五", "河南"}};

    private String javaClassName;
    private String frontendClassName;

    public MyClasses () {
    }

    public MyClasses (String javaClassTitle, String frontendClassName) {
        // 一般来说，构造方法参数作为成员变量的初始化值的时候，尽量同名，这样好维护
        javaClassName = javaClassTitle;
        this.frontendClassName = frontendClassName;
    }

    // public static void getJavaClass () {}

    public String[][] getJavaClass () {
        // 成员方法的调用是可以省略this
        formatInfo("java", javaClass);
        return javaClass;
    }

    public String[][] getFrontendClass () {
        formatInfo("frontend", frontendClass);
        return frontendClass;
    }

    private void formatInfo (String field, String[][] classInfo) {
        switch (field) {
            case "java":
                System.out.println(javaClassName);
                break;
            case "frontend":
                System.out.println(frontendClassName);
                break;
            default:
                break;
        }

        for (String[] studentInfo : classInfo) {
            String name = studentInfo[0];
            String from = studentInfo[1];

            System.out.println(name + " " + from);
        }

        System.out.println();
    }

    public void findJavaAndFrontendStudents () {
        for (String[] javaStudent : MyClasses.this.javaClass) {
            String javaName = javaStudent[0];
            String javaFrom = javaStudent[1];

            for (String[] frontendStudent : frontendClass) {
                String frontendName = frontendStudent[0];
                String frontendFrom = frontendStudent[1];

                if (javaName == frontendName && javaFrom == frontendFrom) {
                    System.out.println(Arrays.toString(javaStudent));
                }
            }
        }
    }
}







