package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PetGroups implements Iterable<Animal>
{
    private List<Animal> dogList;
    private List<Animal> catList;

    PetGroups()
    {
        dogList = new ArrayList<>();
        catList = new ArrayList<>();
    }
    public void addDog(Dog dog) {dogList.add(dog);}
    public void addCat(Cat cat) {catList.add(cat);}


    @Override
    public Iterator<Animal> iterator() {return dogList.iterator();}
    public void sortDogsByName()
    {
        Collections.sort(dogList, new DogComparator());
    }
    public void sortDogsByAge()
    {
        Collections.sort(dogList, new DogComparator());
    }
    public void sortCatsByName()
    {
        Collections.sort(catList, new CatComparator());
    }
    public void sortCatsByAge()
    {
        Collections.sort(catList, new CatComparator());
    }
}
