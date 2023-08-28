package com.enum_learning;

import java.util.Arrays;

public class Test {
    public static void main (String[] args) {
        UserType userType = UserType.GUEST;
        UserType Adamin = UserType.ADMIN;
        System.out.println(userType); // GUEST
        System.out.println(userType.ordinal()); // 2
        System.out.println(Adamin.name()); // ADMIN
        System.out.println(UserType.valueOf("USER")); // USER
        System.out.println(Arrays.toString(UserType.values())); // [ADMIN, USER, GUEST]
    }
}
