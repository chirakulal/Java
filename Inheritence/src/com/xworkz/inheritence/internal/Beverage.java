package com.xworkz.inheritence.internal;

public class Beverage {

    public Beverage() {
        System.out.println("No-arg constructor is running in Beverage");
    }

    public void prepare() {
        System.out.println("Preparing the beverage");
    }
    public void serve() {
        System.out.println("Serving the beverage");
    }
    public void drink() {
        System.out.println("Drinking the beverage");
    }
    public void checkTemperature() {
        System.out.println("Checking beverage temperature");
    }
    public void addSugar() {
        System.out.println("Adding sugar to the beverage");
    }
}
