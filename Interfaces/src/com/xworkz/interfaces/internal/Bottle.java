package com.xworkz.interfaces.internal;

public interface Bottle {

    void fillWater();
    void drinkWater();
    void washBottle();

    default void cleanBottel(){
        System.out.println("Running cleanBottel in Bottel");
    }
}
