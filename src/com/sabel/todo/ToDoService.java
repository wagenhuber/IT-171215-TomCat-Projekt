package com.sabel.todo;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ApplicationScoped
public class ToDoService implements Serializable {

    @Inject
    private ToDoStore toDoStore;



    public List<ToDo> retrieveToDos() {
        return toDoStore.getToDos();
    }

    public void add(ToDo toDo) {
        toDoStore.store(toDo);
    }


    public void delete(ToDo toDo) {
        toDoStore.delete(toDo);
    }

    /*public void loesche(String name) {
        Iterator<ToDo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            ToDo toDo = iterator.next();
            if (toDo.getName().equals(name)) {
                iterator.remove();
            }
        }
    }*/

}
