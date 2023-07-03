package com.DesignPattern.strategy_2;

public class SortedList {
    private SortStrategy sortStrategy;
    private int[] numbers;

    public SortedList (SortStrategy sortStrategy, int[] numbers) {
        this.sortStrategy = sortStrategy;
        this.numbers = numbers;
    }

    public void sort () {
        sortStrategy.sort(numbers);
    }
}
