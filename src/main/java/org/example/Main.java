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

        List<Item> libraryItems = library.getItems();
        for (Item item : libraryItems) {
            if (item instanceof Book) {
                System.out.println("Book: " + item.getTitle());
            } else if (item instanceof DVD) {
                System.out.println(("DVD: " + item.getTitle()));
            }
        }

    }
}
