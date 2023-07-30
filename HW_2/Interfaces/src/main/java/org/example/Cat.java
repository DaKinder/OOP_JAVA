package org.example;

public class Cat extends Animal implements iCat, iPet
{
    private String name;
    String ownerName;
    private int age;
    private Owner owner;

    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void setOwner(Owner owner)
    {
        this.owner = owner;
        this.ownerName = owner.getName();
    }

    public String getOwner(){return ownerName;}
    public void detachOwner(){owner = null;}
    public void greet()
    {
        if(owner != null){ownerName = owner.getName();}
        else ownerName = "не существует, я котобомж(((";
        System.out.println("Мяу! Меня зовут " + name + " .Мне " + age + " лет" + ". Мой владелец " + ownerName );
    }

    @Override
    public void meow() {System.out.println("Мяууу");}
    @Override
    public void play() {System.out.println("кот играет");}
    @Override
    public void hunt() {System.out.println("кот охотится");}
}
