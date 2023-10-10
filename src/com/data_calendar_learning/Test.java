package com.data_calendar_learning;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Test {
    public static void main (String[] args) {
        Date date = new Date();
        // 输出实例（标准时间） Tue Oct 10 14:04:46 CST 2023
        System.out.println(date);
        // 输出毫秒数 （1970.1.1 起到现在的毫秒数）
        // 毫秒数 1696917968558 13位 秒数为10位
        System.out.println(date.getTime());
        // 毫秒转标准时间
        Date lDate = new Date(1696917968558L);
        System.out.println(lDate);
        // 日期格式化
        Date fDate = new Date();
        // yyyy-MM-dd HH:mm 格式与大小写一定要正确
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy年MM月dd日");
        String dateStr = formatter.format(fDate);
        // 2023-10-10 14:15
        System.out.println(dateStr);
        String dateStr1 = formatter1.format(fDate);
        System.out.println(dateStr1);
    }
}
