package com.todoList;

/*
 * 完成一个完成的todoList
 * */
public class Test {
    public static void main (String[] args) {
        TodoListClass todoListClass = new TodoListClass("吃饭", false);
        System.out.println(todoListClass.getTodoList());
    }
}
