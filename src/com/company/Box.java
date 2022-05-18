package com.company;

import java.io.Serializable;
import java.util.Objects;

public class Box implements Serializable {

    public int id;
    public boolean isMatched;

    public Box(int id, boolean isMatched) {
        this.id = id;
        this.isMatched = isMatched;
    }

    public Box(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        Table table = (Table) o;
        return id == table.id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
