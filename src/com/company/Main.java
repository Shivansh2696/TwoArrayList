package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<Box> boxList = new ArrayList<Box>();
        List<Table> tableList = new ArrayList<Table>();

        for (int i = 1; i <=100 ; i++) {
            boxList.add(new Box(i,false));
        }

        for (int i = 1; i <=30 ; i++) {
            if(i%3 == 0){
                tableList.add(new Table(i, UUID.randomUUID().toString().split("-")[0]));
            }
        }

        System.out.println(boxList);
        System.out.println(tableList);

        for (Table table : tableList) {
            for (Box box : boxList) {
                if(box.equals(table)){
                    box.setMatched(true);
                    System.out.println(table.getId() + " " + table.getTableName() );
                }
            }
        }
    }
}
