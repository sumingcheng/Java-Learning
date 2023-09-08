//package com.enum_learning;
//
//public final class Member extends Enum {
//    public static final Member ADMIN;
//    public static final Member USER;
//    public static final Member GUEST;
//
//    private static final Member[] VALUES;
//
//    // 静态代码块（static块）的主要目的是允许在类被加载时执行一些静态初始化代码。这通常包括初始化静态变量，尤其是当变量的初始化需要一些复杂的操作时。
//    static {
//        ADMIN = new Member("ADMIN", 0);
//        USER = new Member("USER", 1);
//        GUEST = new Member("GUEST", 2);
//        VALUES = new Member[]{ADMIN, USER, GUEST};
//    }
//
//    private Member (String name, int ordinal) {
//        super(name, ordinal);
//    }
//
//    public static Member[] valueOf (String name) {
//        return Enum.valueOf(com / enum_learning / Member, name);
//    }
//
//    public static Member[] values () {
//        return (Member[]) VALUES.clone();
//    }
//}
