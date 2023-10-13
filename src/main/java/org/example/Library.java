package org.example;

import java.util.ArrayList;
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

    public List<Item> getItems(){
        return items;
    }

    public List<Client> getClients() {
        return clients;
    }
}
