package com.DesignPattern.strategy_2;

import java.util.Arrays;

public class MergeSortStrategy implements SortStrategy{
    public void sort (int[] numbers) {
        System.out.println(Arrays.toString(numbers));
        System.out.println("省略归并排序的具体实现...");
    }
}
