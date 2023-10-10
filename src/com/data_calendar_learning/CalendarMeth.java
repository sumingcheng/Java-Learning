package com.data_calendar_learning;

import java.util.Calendar;

public class CalendarMeth {
    public static void main (String[] args) {
        Calendar cal = Calendar.getInstance();

//        cal.set(Calendar.DAY_OF_MONTH, 1);
//        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//        cal.set(Calendar.DAY_OF_MONTH, 15);
//        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        test(cal);
        test1(cal);
    }
    // 只要操作的是同一个实例，获取的都是更改以后的
    public static void test (Calendar cal) {
        cal.add(Calendar.MONTH, 1);
    }

    public static void test1 (Calendar cal) {
        System.out.println(cal.get(Calendar.MONTH));
    }
}
