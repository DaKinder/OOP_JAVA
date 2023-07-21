package org.example;

public class Book
{
    private String title;
    private  String author;
    boolean available = true;
    public boolean isAvailable(){return available;}
    public void setAvailable(boolean flag){available = flag;}
    public String getTitle(){return title;}
    public void setTitle(String name){title = name;}
    public String getAuthor(){return author;}
    public void setAuthor(String name){author = name;}
    public Book(String title, String author) {this.title = title; this.author = author; available = true;}
    public void displayInfo()
    {
        System.out.println("Название: " + title + ", автор: " + author);
    }
}
