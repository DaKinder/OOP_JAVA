package org.example;

public interface iDog extends Playing
{
    void woof();
    void guard();
    default void guardHome(){
        System.out.println("охрана периметра");
    };
}
