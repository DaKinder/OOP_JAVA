package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        PetService ps = new PetService();

        ps.addDog("Шарик", 4);
        ps.addCat("Мурзик", 2);
        ps.addDog("Дружок", 6);
        ps.addCat("Барсик", 3);
        ps.addDog("Рекс", 5);
        ps.addCat("Муся", 2);
        ps.checkAge();
        System.out.println(ps.getInfo());
    }

}