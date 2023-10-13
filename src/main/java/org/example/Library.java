package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Library {
    private  List<Item> items;
    private List<Client> clients;

    public Library(){
        items = new ArrayList<>();
        clients = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void registerClient(Client client) {
        clients.add(client);
    }

    public void checkOutItem(Item item, Client client) {
        if(!client.getBorrowedItems().contains((item))) {
            client.getBorrowedItems().add(item);
            Date dueDate = new Date();
            client.setDueDate(dueDate);
        }
    }

    public List<Item> getItems(){
        return items;
    }

    public List<Client> getClients() {
        return clients;
    }
}
