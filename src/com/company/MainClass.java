package com.company;

import java.util.BitSet;

public class MainClass {

    public static void main(String[] args) {
        Books books = new Books();

        books.addBook(new Book(1,"Baba Meca", "Losh mechok"));
        books.addBook(new Book(2,"Kumcho Vulcho", "Losh vulk"));
        books.addBook(new Book(3,"Zaio Baio", "Dobro zaiche"));

        books.iterateBooks(book -> System.out.println(book.getHeading()));
    }
}
