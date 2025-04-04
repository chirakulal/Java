package com.xworkz.inheritence.internal;

public class Fruit {

    public Fruit() {
        System.out.println("No-arg constructor is running in Fruit");
    }

    public void grow() {
        System.out.println("Fruit is growing");
    }
    public void ripen() {
        System.out.println("Fruit is ripening");
    }
    public void harvest() {
        System.out.println("Harvesting fruit");
    }
    public void eat() {
        System.out.println("Eating fruit");
    }
    public void provideNutrition() {
        System.out.println("Fruit is providing nutrition");
    }
}
