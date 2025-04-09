package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Appliance;

public class Refrigerator extends Appliance {
    private String brand;
    private int capacity;
    private boolean hasFreezer;


    public Refrigerator(String brand, int capacity, boolean hasFreezer) {
        this.brand = brand;
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
    }
    @Override
    public void cool(){
        System.out.println("Running cool in  Refrigerator");
    }
    @Override
    public void heat(){
        System.out.println("Running heat in  Refrigerator");
    }
    @Override
    public void runThroughElectric(){
        System.out.println("Running eclectricity in  Refrigerator");
    }
    @Override
    public void storethings(){
        System.out.println("Running storethings in  Refrigerator");
    }
    @Override
    public void  condenser(){
        System.out.println("Running condenser in  Refrigerator");
    }
    public void openDoor(){
        System.out.println("Running openDoor in Refrigerator");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", hasFreezer=" + hasFreezer;
    }
}
