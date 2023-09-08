package com.enum_learning;

public class WebSiteMember {
    public static void main (String[] args) {
        DataInfo dataInfo = DataInfo.SUCCESS;
        System.out.println(dataInfo.getCode()); // 0
        System.out.println(dataInfo.getMessage()); // success

        DataInfo dataInfo2 = DataInfo.INVALID_USERNAME_LENGTH;
        System.out.println(dataInfo2.getCode()); // 1001
        System.out.println(dataInfo2.getMessage()); // invalid username length
    }

}
