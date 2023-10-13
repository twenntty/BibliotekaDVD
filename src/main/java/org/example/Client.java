package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
    private int id;
    private String name;
    private String address;
    private String number;
    private List<Item> borrowedItems = new ArrayList<>();
    private Date dueDate;

    public Client(int id, String name, String address, String number) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getNumber(){
        return number;
    }

    public  List<Item> getBorrowedItems() {
        return borrowedItems;
    }

    public Date getDueDate(){
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
