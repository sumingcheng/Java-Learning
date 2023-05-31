package com.oop;

public class JavaStudent {
    private int sid;
    private String name;
    private int age;
    private boolean isEmployed;


    public JavaStudent () {
    }

    public JavaStudent (int sid, String name, int age, boolean isEmployed) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.isEmployed = isEmployed;
    }

    public void setSid (int sid) {
        this.sid = sid;
    }

    public int getSid () {
        return sid;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public void setIsEmployed (boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    public boolean getIsEmployed () {
        return isEmployed;
    }

    public String getStudent () {
        return "{\n"
                + "\t\"sid\": " + sid + ",\n"
                + "\t\"name\": \"" + name + "\",\n"
                + "\t\"age\": " + age + ",\n"
                + "\t\"isEmployed\": " + isEmployed + ",\n"
                + "}\n";
    }
}
