package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee", 1960);
        DVD dvd1 = new DVD(3, "Inception", "Christopher Nolan", 148);
        DVD dvd2 = new DVD(4, "The Shawshank Redemption", "Frank Darabont", 142);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);
        library.addItem(dvd2);

        library.removeItem(book1); // example remove book

        Client reader1 = new Client(1, "John Doe", "123 Main St, City", "0500000000");
        library.registerClient(reader1);

        Client reader2 = new Client(2, "Alice Smith", "456 Elm St, Town", "18765454");
        library.registerClient(reader2);

        Client clientToCheckOut = library.getClients().get(0);
        Item itemToCheckOut = library.getItems().get(0);

        library.checkOutItem(itemToCheckOut, clientToCheckOut);

        library.displayAvailableItems();

        List<Item> libraryItems = library.getItems();
        for (Item item : libraryItems) {
            if (item instanceof Book) {
                System.out.println("Book: " + item.getTitle() + " Author: " + ((Book) item).getAuthor() + " Year: " + ((Book) item).getYear());
            } else if (item instanceof DVD) {
                System.out.println(("DVD: " + item.getTitle() + " Director: " +((DVD) item).getDirector()));
            }
        }

        List<Client> registeredClients = library.getClients();
        for (Client client : registeredClients) {
            System.out.println("Client: " + client.getName());
        }

    }
}
