package com.xworkz.inheritence.internal;

public class EnergySource {

    public EnergySource() {
        System.out.println("No-arg constructor is running in EnergySource");
    }

    public void generatePower() {
        System.out.println("Generating power");
    }
    public void storeEnergy() {
        System.out.println("Storing energy");
    }
    public void distributeEnergy() {
        System.out.println("Distributing energy");
    }
    public void reduceCarbonFootprint() {
        System.out.println("Reducing carbon footprint");
    }
    public void maintain() {
        System.out.println("Maintaining energy source");
    }
}
