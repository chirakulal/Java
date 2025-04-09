package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Oven;

public class MicrowaveOven extends Oven {
    private String brand;
    private int capacity;
    private boolean hasGrillFunction;


    public MicrowaveOven(String brand, int capacity, boolean hasGrillFunction) {
        this.brand = brand;
        this.capacity = capacity;
        this.hasGrillFunction = hasGrillFunction;
    }
    @Override
    public void preheat() {
        System.out.println("Running preheat in MicrowaveOven");
    }
    @Override
    public void bake() {
        System.out.println("Running bake in MicrowaveOven");
    }
    @Override
    public void grill() {
        System.out.println("Running grill in MicrowaveOven");
    }
    @Override
    public void defrost() {
        System.out.println("Running defrost in MicrowaveOven");
    }
    @Override
    public void turnOff() {
        System.out.println("Running turnOff in MicrowaveOven");
    }
    public void turnOn(){
        System.out.println("Running turnOn in MicrowaveOven");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", hasGrillFunction=" + hasGrillFunction ;
    }
}
