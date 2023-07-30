package org.example;

public class Dog extends Animal implements iDog, iPet
{
    private String name;
    String ownerName;
    private int age;
    private Owner owner;
    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
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
}
