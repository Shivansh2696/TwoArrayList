package com.company;

import java.io.Serializable;

public class Table implements Serializable {
    public int id;
    public String tableName;

    public Table(int id, String tableName) {
        this.id = id;
        this.tableName = tableName;
    }

    public Table(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public String toString() {
       return String.valueOf(id);
    }
}
