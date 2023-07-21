package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library
{
    private List<Book> catalog = new ArrayList<>();
    public List<Book> getCatalog(){return catalog;}
    public void addBook(Book book) {catalog.add(book);}
    public void removeBook(Book book){catalog.remove(book);}
    public void displayAvailableBooks()
    {
        for (Book i : catalog)
        if(i.isAvailable()) {i.displayInfo();}
    }
    public void searchByAuthor(String name)
    {

    }
}
