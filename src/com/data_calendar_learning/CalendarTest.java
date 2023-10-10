package com.data_calendar_learning;

import java.util.Calendar;

public class CalendarTest {
    public static void main (String[] args) {
        printCalendar(2023, Calendar.OCTOBER);
    }

    public static void printCalendar (int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);  // 设置为目标月份的第一天

        // 找到目标月份第一天是星期几
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // 设置为目标月份的最后一天，然后找到目标月份的最后一天是星期几
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        int lastDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // 输出星期标题
        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : daysOfWeek) {
            System.out.print(day + " ");
        }
        System.out.println();

        // 输出上个月的最后几天
        calendar.set(year, month, 1);
        calendar.add(Calendar.DAY_OF_YEAR, -(firstDayOfWeek - 1));
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print(String.format("%02d ", calendar.get(Calendar.DAY_OF_MONTH)));
            calendar.add(Calendar.DAY_OF_YEAR, 1);
        }

        // 输出目标月份的所有天
        calendar.set(year, month, 1);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.print(String.format("%02d ", i));
            if ((i + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();  // 换行，每周七天
            }
        }

        // 输出下个月的前几天
        calendar.set(year, month, daysInMonth);
        for (int i = lastDayOfWeek; i < 7; i++) {
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            System.out.print(String.format("%02d ", calendar.get(Calendar.DAY_OF_MONTH)));
        }
    }
}

