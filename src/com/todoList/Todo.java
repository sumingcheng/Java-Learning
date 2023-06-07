package com.todoList;

public class Todo {
    private int id = 1;
    private String content;
    private boolean completed;

    public Todo () {
    }

    public Todo (int id, String content, boolean completed) {
        this.id = id;
        this.content = content;
        this.completed = completed;
    }

    public void setId (int id) {
        this.id = id;
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

    public void setCompleted (boolean completed) {
        this.completed = completed;
    }

    public boolean getCompleted () {
        return completed;
    }
}
