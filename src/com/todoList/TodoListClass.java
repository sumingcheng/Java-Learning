package com.todoList;

public class TodoListClass {
    private int id = 1;
    private String content;
    private boolean isDone;

    public TodoListClass () {
    }

    public TodoListClass (String content, boolean isDone) {
        this.id = id;
        this.content = content;
        this.isDone = isDone;
    }

    public int setId () {
        return id++;
    }

    public int getId () {
        return id;
    }

    public void setContent (String content) {
        this.content = content;
    }

    public String getContent () {
        return content;
    }

    public void setIsDone (boolean isDone) {
        this.isDone = isDone;
    }

    public boolean getIsDone () {
        return isDone;
    }

    public String getTodoList () {
        return this.id + "|" + this.content + "|" + this.isDone;
    }
}
