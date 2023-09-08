package com.enum_learning;

public enum DataInfo {
    // 枚举类内部，必须先定义枚举实例，再定义其他内容
    SUCCESS(0, "success"),
    INVALID_USERNAME_LENGTH(1001, "invalid username length"),
    INVALID_PASSWORD_LENGTH(1002, "invalid password length"),
    USERNAME_NOT_EXIST(1003, "username not exist"),
    WRONG_PASSWORD(1004, "wrong password");

    private int code;
    private String message;

    private DataInfo (int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode () {
        return code;
    }

    public void setCode (int code) {
        this.code = code;
    }

    public String getMessage () {
        return message;
    }

    public void setMessage (String message) {
        this.message = message;
    }
}
