package org.example;

public class Cat
{
    private String name;
    String ownerName;
    private int age;
    Owner owner;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int value) {age = value;}
    public void setOwner(Owner owner){this.owner = owner;}
    public Owner getOwner(){return owner;}
    public void detachOwner(){owner = null;}
    public void greet()
    {
        if(owner != null){ownerName = owner.getName();}
        else ownerName = "не существует, я котобомж(((";
        System.out.println("Мяу! Меня зовут " + name + " .Мне " + age + " лет" + ". Мой владелец " + ownerName );
    }
}
