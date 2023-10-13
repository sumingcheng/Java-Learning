package com.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test5 {
    public static void main (String[] args) {
//        try {
//            boolean value = false;
//            if (!value) {
//                throw new CustomException("这是自定义的异常信息");
//            }
//        } catch (CustomException ex) {
//            System.out.println(ex.getMessage());
//        }
//        try {
//            intInput();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        try {
            readFile("D:\\Desktop\\GitHub\\Java-Learning\\src\\com\\Exception\\data.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int intInput () throws InputMismatchException {
        System.out.println("请输入数字");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("输入的数字需要int类型");
        }
    }

    public static void readFile (String path) throws IOException {
        try {
            FileInputStream fis = new FileInputStream(new File(path));

            int data = fis.read();

            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
            fis.close();
        } catch (IOException e) {
            throw new IOException("文件读取失败");
        }
    }

}
