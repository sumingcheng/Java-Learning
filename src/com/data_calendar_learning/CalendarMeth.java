package com.data_calendar_learning;

import java.util.Calendar;

public class CalendarMeth {
    public static void main (String[] args) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal1.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(cal1.get(Calendar.DAY_OF_MONTH));
        cal2.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println(cal2.get(Calendar.DAY_OF_MONTH));

//        test(cal);
//        test1(cal);
    }
    // 只要操作的是同一个实例，获取的都是更改以后的
//    public static void test (Calendar cal) {
//        cal.add(Calendar.MONTH, 1);
//    }
//
//    public static void test1 (Calendar cal) {
//        System.out.println(cal.get(Calendar.MONTH));
//    }
}
