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

    private boolean isItemBorrowed(Item item) {
        for (Client client : clients) {
            if(client.getBorrowedItems().contains(item)) {
                return true;
            }
        }
        return false;
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

    public void displayAvailableItems() {
        System.out.println("Available Items: ");
        for (Item item : items) {
            if (!isItemBorrowed(item)){
                if(item instanceof Book) {
                    System.out.println("Book: " + item.getTitle());
                } else if (item instanceof  DVD) {
                    System.out.println(("DVD: " + item.getTitle()));
                }
            }
        }
    }

    public void displayBorrowedItems() {
        System.out.println("Borrowed Items:");
        for (Client client : clients) {
            List<Item> borrowedItems = client.getBorrowedItems();
            if (!borrowedItems.isEmpty()) {
                System.out.println("Client: " + client.getName());
                for (Item item : borrowedItems) {
                    if (item instanceof Book) {
                        System.out.println("Book: " + item.getTitle());
                    } else if (item instanceof DVD) {
                        System.out.println("DVD: " + item.getTitle());
                    }
                }
            }
        }
    }

    public List<Item> getItems(){
        return items;
    }

    public List<Client> getClients() {
        return clients;
    }
}
