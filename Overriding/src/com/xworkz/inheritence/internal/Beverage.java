package com.xworkz.inheritence.internal;

public class Beverage {

    public Beverage() {
        System.out.println("No-arg constructor is running in Beverage");
    }

    public void prepare() {
        System.out.println("Running prepare in Beverage");
    }

    public void serve() {
        System.out.println("Running serve in Beverage");
    }

    public void drink() {
        System.out.println("Running drink in Beverage");
    }

    public void checkTemperature() {
        System.out.println("Running checkTemperature in Beverage");
    }

    public void addSugar() {
        System.out.println("Running addSugar in Beverage");
    }

}
