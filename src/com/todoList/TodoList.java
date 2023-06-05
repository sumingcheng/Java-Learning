package com.todoList;

import java.util.Arrays;

public class TodoList {
    private Todo[] todoList;
    private int _actualLength = 0;

    public TodoList () {
    }

    public TodoList (Todo[] todoList) {
        this.todoList = todoList;
        this._actualLength = todoList.length;
    }

    public Todo[] getTodoList () {
        return todoList;
    }

    public int addTodo (Todo todo) {
        if (this._actualLength >= todoList.length) {
            int len = todoList.length * 2;
            todoList = Arrays.copyOf(todoList, len);
        }
        todo.setId(this._actualLength + 1);
        todoList[this._actualLength++] = todo;
        return _actualLength;
    }

    public Todo getTodo (int id) {
        for (int i = 0; i < this._actualLength; i++) {
            if (todoList[i].getId() == id) {
                return todoList[i];
            }
        }
        return null;
    }

    public int removeTodo (int id) {
        for (int i = 0; i < this._actualLength; i++) {
            if (todoList[i].getId() == id) {
                for (int j = i; j < this._actualLength - 1; j++) {
                    todoList[j] = todoList[j + 1];
                }
                todoList[this._actualLength - 1] = null;
                this._actualLength--;
                return id;
            }
        }
        return 0;
    }

    public int toggleTodo (int id) {
        for (int i = 0; i < this._actualLength; i++) {
            if (todoList[i].getId() == id) {
                todoList[i].setCompleted(!todoList[i].getCompleted());
                return id;
            }
        }
        return 0;
    }

    public int updateTodo (int id, String content) {
        for (int i = 0; i < this._actualLength; i++) {
            if (todoList[i].getId() == id) {
                todoList[i].setContent(content);
                return id;
            }
        }
        return 0;
    }


}
