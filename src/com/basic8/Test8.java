package com.basic8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 输入元素个数
 * 输入随机数范围
 * 输入猜想的数
 * 当前数组的最大值和最小值
 * */
public class Test8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数字的个数");
        int numberCount = sc.nextInt();
        System.out.println("请输入最大随机数");
        int maxRandomNumber = sc.nextInt();
        System.out.println("请输入猜测的数字");
        int userNumber = sc.nextInt();

        int[] numberContainer = createNumberContainer(numberCount, maxRandomNumber);

        System.out.println(Arrays.toString(numberContainer));

        boolean isFound = searchUserNumberFromCotainer(numberContainer, userNumber);
        if (isFound) {
            System.out.println("数字" + userNumber + "存在");
        } else {
            System.out.println("数字" + userNumber + "不存在");
        }
    }

    public static int[] createNumberContainer (int numberCount, int maxRandomNumber) {
        int[] container = new int[numberCount];
        Random random = new Random();
        for (int i = 0; i < numberCount; i++) {
            container[i] = random.nextInt(maxRandomNumber);
        }
        return container;
    }

    public static boolean searchUserNumberFromCotainer (int[] numberContainer, int userNumber) {
        boolean _isFound = false;
        for (int number : numberContainer) {
            if (userNumber == number) {
                _isFound = true;
                break;
            }
        }
        return _isFound;
    }
}
