package com.data_calendar_learning;  // 定义包名

import java.util.Calendar;  // 导入java.util.Calendar类

public class CalendarTest {  // 定义公共类CalendarTest

    // 定义一个静态方法用于打印传入的Calendar对象的年、月和日
    public static void print (Calendar cal) {
        int year = cal.get(Calendar.YEAR);  // 获取年份
        int month = cal.get(Calendar.MONTH) + 1;  // 获取月份并加1，因为月份是从0开始的
        int day = cal.get(Calendar.DAY_OF_MONTH);  // 获取日期

        System.out.println("当前日期: " + year + "-" + month + "-" + day);  // 打印年、月和日
    }

    public static void main (String[] args) {  // 定义主方法
        Calendar cal = Calendar.getInstance();  // 获取Calendar实例，初始化为当前日期和时间

        cal.set(Calendar.DAY_OF_MONTH, 1);  // 设置cal对象为当前月的第一天
        int weekday = cal.get(Calendar.DAY_OF_WEEK);  // 获取当前月第一天是周几

        // 获取当月一共多少天
        cal.add(Calendar.MONTH, 1);  // 将cal对象的月份字段增加1，即跳转到下个月
        cal.add(Calendar.DAY_OF_MONTH, -1);  // 将cal对象的日期字段减少1，即回到本月的最后一天
        int currentMonthDayCount = cal.get(Calendar.DAY_OF_MONTH);  // 获取本月最后一天的日期，即本月的天数
        int lastDayWeekday = cal.get(Calendar.DAY_OF_WEEK);  // 获取本月最后一天是周几

        // 获取上个月一共多少天
        cal.add(Calendar.MONTH, -1);  // 将cal对象的月份字段减少1，即回到本月
        int lastMonthDayCount = cal.get(Calendar.DAY_OF_MONTH);  // 获取上个月的天数

        String[] weekDayArr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};  // 创建一个数组来存储星期的缩写
        int[] monthDayArr = new int[35];  // 创建一个长度为35的数组来存储日历的天数
        int length = 0;  // 初始化length变量为0，用于跟踪monthDayArr数组的当前长度

        // 填充上个月在当前月日历中显示的天数
        for (int i = lastMonthDayCount - weekday + 2; i <= lastMonthDayCount; i++) {
            monthDayArr[length++] = i;
        }

        // 填充本月的天数
        for (int i = 1; i <= currentMonthDayCount; i++) {
            monthDayArr[length++] = i;
        }

        // 填充下个月在当前月日历中显示的天数
        for (int i = 1; i < 7 - lastDayWeekday; i++) {
            monthDayArr[length++] = i;
        }

        // 星期视图
        for (int i = 0; i < weekDayArr.length; i++) {  // 输出星期的缩写
            System.out.print(weekDayArr[i] + "\t");
        }
        System.out.println();  // 输出一个换行符，使星期的缩写和日期显示在不同的行上

        // 日期视图
        for (int i = 0; i < monthDayArr.length; i++) {  // 输出日期
            System.out.print(monthDayArr[i] + "\t");
            if ((i + 1) % 7 == 0) {  // 检查是否已输出7天，如果是，则输出一个换行符以开始新的一行
                System.out.println();
            }
        }

        print(cal);  // 调用print方法打印当前的年、月和日
    }
}
