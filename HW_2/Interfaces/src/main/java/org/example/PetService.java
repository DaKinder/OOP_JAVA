package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PetService
{
    private List<PetGroups> petGroupList;
    private PetGroups activePetGroup;
    private int id;
    PetService()
    {
        activePetGroup = new PetGroups();
        petGroupList = new ArrayList<>();
        petGroupList.add(activePetGroup);
    }
    public void addDog(String name, int age)
    {
        Animal animal = new Dog(name, age);
    }
    public void addCat(String name, int age)
    {
        Animal animal = new Cat(name, age);
    }
    public String getInfo()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Список : \n");
        for (Animal animal: activePetGroup)
        {
            sb.append(animal);
            sb.append("\n");
        }
        return sb.toString();
    }
    public void checkAge()
    {
        Predicate<Integer> predicate = age -> age < 0;
    }
}
