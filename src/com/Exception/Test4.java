package com.Exception;

import java.util.ArrayList;

public class Test4 {
    public static void main (String[] args) {
        ArrayList<Logger> loggerList = new ArrayList<>();

        int a = 0, b = 0;
        Logger logger = null;

        try {
            a = 5;
            int res = division(a, b);
            logger = new Logger(a, b, res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logger = new Logger(a, b, e);
        } finally {
            loggerList.add(logger);
        }

        try {
            a = 10;
            b = 2;

            int res = division(a, b);
            logger = new Logger(a, b, res);
        } catch (Exception e) {
            System.out.println(e);
            logger = new Logger(a, b, e);
        } finally {
            loggerList.add(logger);
        }
        System.out.println(loggerList);
    }

    public static int division (int a, int b) throws Exception {
        return a / b;
    }
}
