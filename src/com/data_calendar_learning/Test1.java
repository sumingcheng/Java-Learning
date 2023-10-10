package com.data_calendar_learning;


import java.util.Calendar;

public class Test1 {
    public static void main (String[] args) {
        Calendar calendar = Calendar.getInstance();
        // Tue Oct 10 14:25:40 CST 2023
        System.out.println(calendar.getTime());
        // 设置日历的年月日
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        // 在当前年月日上增加
        calendar.add(Calendar.MONTH, 1);
        System.out.println(calendar.get(Calendar.MONTH));
        // 当前是一周的第几天 （从周日算起）
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        // 当前是今年的第几天
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        // 当前出在当月的第几周
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }
}
