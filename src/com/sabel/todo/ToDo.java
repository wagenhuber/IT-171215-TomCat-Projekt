package com.sabel.todo;

import java.util.Objects;

public class ToDo {

    private String name;

    public ToDo() {
    }

    public ToDo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDo toDo = (ToDo) o;
        return Objects.equals(name, toDo.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }


    @Override
    public String toString() {
        return name;
    }
}
