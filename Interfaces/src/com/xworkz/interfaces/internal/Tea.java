package com.xworkz.interfaces.internal;

public interface Tea {

    void boilWater();
    void addTeaPowder();
    void serveTea();

    default void drinkTea(){
        System.out.println("Running drinkTea in Tea");
    }
}
