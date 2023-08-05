package org.example;

public class Cat extends Animal implements iCat, iPet, Comparable<Cat>
{
    private String name;
    String ownerName;
    private int age;
    private Owner owner;

    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){return this.name;}


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
    @Override
    public void setOwner(Owner owner)
    {
        this.owner = owner;
        this.ownerName = owner.getName();
    }
    @Override
    public String toString(){return "питомец[ кличка" + name + ", возраст " + age + ']';}
    @Override
    public int compareTo(Cat cat) {
        return name.compareTo(cat.name);
    }
}
