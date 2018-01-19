package com.sabel.todo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ToDoService {


    //mittels Static ist die Liste nur ein einziges Mal vorhanden! Nutzt man wenn Datenfeld nur einmal erzeugt werden soll.
    //alle erzeugten Objekte von ToDoService würden auf die gleiche statische Liste zugreifen!
    //Statische Datenfelder werden vor dem Konstruktoraufruf initialisiert.
    private static List<ToDo> todos = new ArrayList<>();

    //wird vor Konstruktor aufgerufen!
    static {
        todos.add(new ToDo("Java EE lernen"));
        todos.add(new ToDo("BA lernen"));
        todos.add(new ToDo("Tanzen lernen"));
    }



    public ToDoService() {

    }



    public List<ToDo> retrieveToDos(){
        return todos;
    }

    public void add(ToDo toDo){
        todos.add(toDo);
    }


    public void delete(ToDo toDo){
        todos.remove(toDo);
    }

    public void loesche(String name){
        Iterator<ToDo> iterator = todos.iterator();
        while (iterator.hasNext()){
            ToDo toDo = iterator.next();
            if (toDo.getName().equals(name)){
                iterator.remove();
            }
        }
    }

}
