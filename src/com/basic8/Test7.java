package com.basic8;

import java.util.Scanner;

public class Test7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数");
        int rowCount = sc.nextInt();
        int[][] triangleArr = new int[rowCount][];

        for (int i = 0; i < triangleArr.length; i++) {
            triangleArr[i] = new int[i + 1];

            triangleArr[i][0] = 1;
            triangleArr[i][i] = 1;

            for (int j = 1; j < triangleArr[i].length - 1; j++) {
                triangleArr[i][j] = triangleArr[i - 1][j - 1] + triangleArr[i - 1][j];
            }
        }

        for (int i = 0; i < triangleArr.length; i++) {

            for (int k = 0; k < (rowCount - (i + 1)) * 2; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < triangleArr[i].length; j++) {
                System.out.print(triangleArr[i][j] + "  ");
            }

            System.out.println();
        }
    }
}
