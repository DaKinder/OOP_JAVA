package org.example;

import java.util.function.Predicate;

public class Dog extends Animal implements iDog, iPet, Comparable<Dog>
{
    private String name;
    String ownerName;
    private int age;
    private Owner owner;
    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){return this.name;}
    @Override
    public void woof() {System.out.println("гав гав");}
    @Override
    public void play() {System.out.println("пёс играет");}
    @Override
    public void guard() {System.out.println("пёс охраняет заданный объект");}
    @Override
    public void setOwner(Owner owner)
    {
        this.owner = owner;
        this.ownerName = owner.getName();
    }
    @Override
    public void detachOwner() {owner = null;}
    @Override
    public String toString(){return "питомец[ кличка" + name + ", возраст " + age + ']';}
    @Override
    public int compareTo(Dog dog) {
        return name.compareTo(dog.name);
    }
    public void checkAge()
    {
        Predicate<Integer> predicate = age -> age < 0;
    }
}
