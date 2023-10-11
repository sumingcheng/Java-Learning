package com.Exception;

public class Student {
    private String name;
    private Integer age;

    public Student (String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Integer getAge () {
        return age;
    }

    public void setAge (Integer age) {
        this.age = age;
    }
}
