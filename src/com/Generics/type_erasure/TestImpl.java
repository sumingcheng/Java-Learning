package com.Generics.type_erasure;

public class TestImpl implements TestInterface<String> {

    public String test (String value) {
        return value;
    }

    // 桥接方法
//    public Object test (Object value) {
//        return test((String) value);
//    }
}
