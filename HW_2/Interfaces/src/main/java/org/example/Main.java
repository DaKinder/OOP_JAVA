package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Owner owner = new Owner("Александр Владимирович");
        List<Animal> animals = new ArrayList<>();
        Cat cat = new Cat("Бариск", 2);
        animals.add(cat);
        Dog dog = new Dog("Шарик", 3);
        animals.add(dog);
        cat.setOwner(owner);
        System.out.println(cat.getOwner());
        dog.guard();
        dog.detachOwner();
    }
}