package com.Generics.type_erasure;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main (String[] args) {
//        ErasureTest<Integer> erasureTest = new ErasureTest<>(100);
//        Class<? extends ErasureTest> classFile = erasureTest.getClass();

//        Field[] allFields = classFile.getDeclaredFields();
//
//        for (Field field : allFields) {
//            System.out.printf(field.getName() + ":" + field.getType().getSimpleName()); // Object
//        }

//        Method[] allMethod = classFile.getDeclaredMethods();
//        for (Method method : allMethod) {
//            System.out.println(method.getName() + ":" + method.getReturnType().getSimpleName());
//        }

        Class<TestImpl> testClass = TestImpl.class;

        Method[] allMethod = testClass.getDeclaredMethods();

        for (Method method : allMethod) {
            System.out.println(method.getName() + ":" + method.getReturnType().getSimpleName());
        }

    }
}
