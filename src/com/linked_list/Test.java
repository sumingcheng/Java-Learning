package com.linked_list;

public class Test {
    public static void main (String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);

        linkedList.print();

        boolean isRemoved = linkedList.remove(3);
        System.out.println(isRemoved);

        linkedList.print();

        boolean isExist = linkedList.find(5);
        System.out.println(isExist);

        linkedList.update(2, 200);
        linkedList.update(5, 500);
        linkedList.update(1, 100);
        linkedList.print();

        linkedList.insert(2, 300);
        linkedList.insert(4, 400);
        linkedList.print();
    }
}
