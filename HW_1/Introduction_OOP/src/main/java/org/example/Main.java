package org.example;

public class Main {
    public static void main(String[] args)
    {
        // task №1
        Cat cat = new Cat();
        cat.setName("Барсик");
        cat.setAge(5);
        cat.getAge();
        Owner owner = new Owner();
        owner.setName("Валера");
        cat.setOwner(owner);
        cat.greet();
        cat.detachOwner();
        cat.greet();

        // task №2
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(15,20);
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());

        // task №3
        Library library = new Library();
        Book book1 = new Book("Рождественская История", "Чарльз Диккенс");
        Book book2 = new Book("Мастер и Маргарита", "Михаил Булгаков");
        Book book3 = new Book("Преступление и наказание", "Федор Достоевский");
        Book book4 = new Book("Герой нашего времени", "Михаил Лермонтов");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.displayAvailableBooks();
        System.out.println("------------------------------------------------------------");
        library.removeBook(book2);
        book1.setAvailable(false);
        library.displayAvailableBooks();
    }
}