package com.xworkz.inheritence.internal;

public class DairyProduct {

    public DairyProduct() {
        System.out.println("No-arg constructor is running in DairyProduct");
    }

    public void storeCold() {
        System.out.println("Storing at low temperature");
    }
    public void consume() {
        System.out.println("Consuming dairy product");
    }
    public void mixWithFood() {
        System.out.println("Mixing with food items");
    }
    public void provideNutrients() {
        System.out.println("Providing essential nutrients");
    }
    public void expireQuickly() {
        System.out.println("Has a short shelf life");
    }
}
