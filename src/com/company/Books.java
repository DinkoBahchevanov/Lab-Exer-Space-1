package com.company;

import java.util.HashMap;
import java.util.Map;

public class Books {

    private Map<Integer, Book> map;

    public Books() {
        this.map = new HashMap<>();
    }

    public void addBook(Book book) {
        this.map.putIfAbsent(book.getISBN(), book);
    }

    public int countBooks() {
        return map.size();
    }

    public void deleteBookByISBN(int ISBN) {
        map.remove(ISBN);
    }

    public void iterateBooks(BookOperation bookOperation) {
        for (Book book : map.values() ) {
            bookOperation.operation(book);
        }
    }
}
