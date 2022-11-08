package com.richie.mcdonough.librarynew;

import com.richie.mcdonough.library.Book;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NewLibrary implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private List<NewBook> books;

    public NewLibrary(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public List<NewBook> getBooks() {
        return books;
    }

    public void addBooks(NewBook book) {
        books.add(book);
    }

    public void removeBook(NewBook book) {
        books.remove(book);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
