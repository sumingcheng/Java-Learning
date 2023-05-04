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

        int maximumValue = findTheMaximumValue(numberContainer, "MAX");
        System.out.println("最大值:" + maximumValue);
        int minimumValue = findTheMaximumValue(numberContainer, "MIX");
        System.out.println("最小值:" + maximumValue);
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

    public static int findTheMaximumValue (int[] numberContainer, String type) {
        int finalNumber = numberContainer[0];
        int len = numberContainer.length;

        for (int i = 1; i < len; i++) {
            switch (type) {
                case "MAX":
                    if (numberContainer[i] > finalNumber) {
                        finalNumber = numberContainer[i];
                    }
                    break;
                case "MIX":
                    if (numberContainer[i] < finalNumber) {
                        finalNumber = numberContainer[i];
                    }
                    break;
                default:
                    break;
            }
        }
        return finalNumber;
    }
}
