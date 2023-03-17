package com.todoapp.models;

public class Todo {
    private int id;
    private String todoTitle;
    private String todoContent;

    public Todo() {
    }

    public Todo(int id, String todoTitle, String todoContent) {
        this.id = id;
        this.todoTitle = todoTitle;
        this.todoContent = todoContent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public String getTodoContent() {
        return todoContent;
    }

    public void setTodoContent(String todoContent) {
        this.todoContent = todoContent;
    }


  
    
    
    
    
}
