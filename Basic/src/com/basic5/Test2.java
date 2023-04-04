package com.basic5;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
         * switch
         * 兼容类型：byte,short,char,int,enum,String
         * 最终都会转换成int
         * 不兼容类型：long,float,double,boolean
         * */

//        int a = 1;
//        switch (a) {
//            case 1:
//                System.out.println("a=1");
//                break;
//            case 2:
//                System.out.println("a=2");
//                break;
//            default:
//                System.out.println("a=3");
//                break;
//        }

//        int value;
//
//        Scanner sr = new Scanner(System.in);
//        System.out.println("请输入一个数字：");
//        value = sr.nextInt();
//
//        switch (value) {
//            case 1:
//                System.out.println("a=1");
//                break;
//            case 2:
//                System.out.println("a=2");
//                break;
//            default:
//                System.out.println("a=" + value);
//                break;
//        }

//        贯穿

//        int value;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个数字：");
//        value = scanner.nextInt();

//        switch (value) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("初级");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("中级");
//                break;
//            case 7:
//            case 8:
//            case 9:
//                System.out.println("高级");
//                break;
//            default:
//                System.out.println("输入错误");
//                break;
//        }
//
////        简写  java 14+ 以上支持
//
//        switch (value) {
//            case 1, 2, 3:
//                System.out.println("初级");
//                break;
//            case 4, 5, 6:
//                System.out.println("中级");
//                break;
//            case 7, 8, 9:
//                System.out.println("高级");
//                break;
//            default:
//                System.out.println("输入错误");
//                break;
//        }


//        boolean a =false;
//
//        switch (a){
//            case true:
//                System.out.println("true");
//                break;
//            case false:
//                System.out.println("false");
//                break;
//        }


//        int primary = 60, intermediate = 80, senior = 100;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个数字：");
//        String value = scanner.next();
//
//        // lambda like
//        int achievement = switch (value) {
//            case "初级" -> {
//                yield primary;
//            }
//            case "中级" -> {
//                yield intermediate;
//            }
//            case "高级" -> {
//                yield senior;
//            }
//            // 抛出一个异常，表示找不到合适的情况
//            default -> {
//                System.out.println(("找不到合适的情况: " + value));
//            }
//        };
//
//        System.out.println(achievement);
    }
}
