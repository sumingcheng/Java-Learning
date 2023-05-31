package com.oop;

import java.util.Arrays;

public class JavaClass {
    private JavaStudent[] javaClass = null;
    private int actualLength = 0;

    public JavaClass () {
        this.javaClass = new JavaStudent[5];
    }

    public JavaClass (int length) {
        this.javaClass = new JavaStudent[length > 0 ? length : 5];
    }

    public int push (JavaStudent student) {
        if (actualLength >= javaClass.length) {
            int len = javaClass.length * 2;
            javaClass = Arrays.copyOf(javaClass, len);
        }
        javaClass[actualLength++] = student;
        return actualLength;
    }

    public JavaStudent[] find (int sid) {
        for (JavaStudent student : javaClass) {
            if (student.getSid() == sid) {
                return new JavaStudent[]{student};
            }
        }

        return null;
    }

    public int update (JavaStudent student) {
        int sid = student.getSid();
        JavaStudent _student = find(sid)[0];
        if (_student != null) {
            _student.setName(student.getName());
            _student.setAge(student.getAge());
            _student.setIsEmployed(student.getIsEmployed());
            return sid;
        }

        return 0;
    }

    public int delete (int sdi) {
        for (int i = 0; i < actualLength; i++) {
            if (javaClass[i].getSid() == sdi) {
                for (int j = i; j < actualLength - 1; j++) {
                    javaClass[j] = javaClass[j + 1];
                }
                javaClass[actualLength - 1] = null;
                actualLength--;
                return sdi;
            }
        }
        return 0;
    }

    public String getJavaClass () {
        String stringData = "";
        for (int i = 0; i < actualLength; i++) {
            stringData += javaClass[i].getStudent();
        }

        return "[" + stringData + "]";
    }
}
