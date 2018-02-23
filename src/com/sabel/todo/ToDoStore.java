package com.sabel.todo;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
public class ToDoStore implements Serializable{

    private List<ToDo> toDos;

    public ToDoStore() {
        this.toDos = new ArrayList<>();
        toDos.add(new ToDo("Java EE lernen"));
        toDos.add(new ToDo("BA lernen"));
        toDos.add(new ToDo("Tanzen lernen"));
    }

    public void store(ToDo toDo) {
        toDos.add(toDo);
    }

    public void delete(ToDo toDo) {
        toDos.remove(toDo);
    }

    public List<ToDo> getToDos() {
        return toDos;
    }
}
