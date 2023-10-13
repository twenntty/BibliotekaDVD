package org.example;

import java.util.ArrayList;
import java.util.List;
public class Library {
    private  List<Item> items;

    public Library(){
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems(){
        return items;
    }
}
