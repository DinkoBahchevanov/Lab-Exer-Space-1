package com.company;

public class Book {

    private int ISBN;
    private String heading;
    private String description;

    public Book() {

    }

    public Book(Book book) {
        this.ISBN = book.getISBN();
        this.description = book.getDescription();
        this.heading = book.getHeading();
    }

    public Book(int ISBN, String heading, String description) {
        this.ISBN = ISBN;
        this.description = description;
        this.heading = heading;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
