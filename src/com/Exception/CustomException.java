package com.Exception;

public class CustomException extends Exception {
    public CustomException (String message) {
        super(message);  // 调用父类构造方法
    }
}