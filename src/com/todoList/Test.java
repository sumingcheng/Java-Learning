package com.todoList;

import java.util.Scanner;

/*
 * 完成一个完成的todoList
 * */
public class Test {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        Todo todo1 = new Todo(1, "吃饭", false);
        Todo todo2 = new Todo(2, "睡觉", false);
        Todo todo3 = new Todo(3, "打豆豆", false);

        Todo[] todos = new Todo[3];
        todos[0] = todo1;
        todos[1] = todo2;
        todos[2] = todo3;

        TodoList todoLists = new TodoList(todos);

        int menuNum = printMenu(scanner);

        switchOperation(menuNum, todoLists, scanner);
    }

    public static void switchOperation (int number, TodoList todoList, Scanner scanner) {
        switch (number) {
            case 0:
                printTodoList(todoList);
                break;
            case 1:
                getTodo(todoList, scanner);
                break;
            case 2:
                addTodo(todoList, scanner);
                break;
            case 3:
                toggleTodo(todoList, scanner);
                break;
            case 4:
                removeTodo(todoList, scanner);
                break;
            case 5:
                updateTodo(todoList, scanner);
                break;
            default:
                System.out.println("请输入正确的数字");
                break;
        }

        int menuNum = printMenu(scanner);
        switchOperation(menuNum, todoList, scanner);
    }

    public static int printMenu (Scanner scanner) {
        System.out.println("————————————————————————");
        System.out.println("Plesase input the number of menu");
        System.out.println("0 - show menu");
        System.out.println("1 - get todo");
        System.out.println("2 - add todo");
        System.out.println("3 - toggle todo");
        System.out.println("4 - remove todo");
        System.out.println("5 - update todo");
        System.out.println("————————————————————————");
        int menuNum = scanner.nextInt();
        return menuNum;
    }

    public static void printTodo (Todo todo) {
        if (todo != null) {
            System.out.println(todo.getId() + ":" + todo.getContent() + ":" + todo.getCompleted());
        }
    }

    public static void printTodoList (TodoList todoList) {
        for (Todo todo : todoList.getTodoList()) {
            printTodo(todo);
        }
    }

    public static void getTodo (TodoList todoList, Scanner scanner) {
        System.out.println("请输入要查找的todo的id");
        int id = scanner.nextInt();
        Todo todo = todoList.getTodo(id);
        printTodo(todo);
    }

    public static void addTodo (TodoList todoList, Scanner scanner) {
        System.out.println("请输入要添加的todo的内容");
        String content = scanner.next();
        Todo todo = new Todo(0, content, false);
        todoList.addTodo(todo);
    }

    public static void toggleTodo (TodoList todoList, Scanner scanner) {
        System.out.println("请输入要修改的todo的id");
        int id = scanner.nextInt();
        todoList.toggleTodo(id);
    }

    public static void removeTodo (TodoList todoList, Scanner scanner) {
        System.out.println("请输入要删除的todo的id");
        int id = scanner.nextInt();
        todoList.removeTodo(id);
    }

    public static void updateTodo (TodoList todoList, Scanner scanner) {
        System.out.println("请输入要修改的todo的id");
        int id = scanner.nextInt();
        System.out.println("请输入要修改的todo的内容");
        String content = scanner.next();
        todoList.updateTodo(id, content);
    }
}
