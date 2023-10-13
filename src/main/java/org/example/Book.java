package org.example;

public class Book extends Item {
    private String author;
    private int year;

    public Book(int id, String title, String author, int year) {
        super(id, title);
        this.author = author;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
