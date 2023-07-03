package com.DesignPattern.strategy_2;

public class Main {
    public static void main (String[] args) {
        int[] numbers = {4, 2, 3, 1, 5};

        SortedList list1 = new SortedList(new BubbleSortStrategy(), numbers);
        list1.sort();

        SortedList list2 = new SortedList(new QuickSortStrategy(), numbers);
        list2.sort();

        SortedList list3 = new SortedList(new MergeSortStrategy(), numbers);
        list3.sort();
    }
}
