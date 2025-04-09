package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Computer;

public class Laptop extends Computer {

    private String brand;
    private int ramSize;
    private boolean hasTouchscreen;


    public Laptop(String brand, int ramSize, boolean hasTouchscreen) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.hasTouchscreen = hasTouchscreen;
    }
    @Override
    public void bootUp() {
        System.out.println("Running bootUp in Laptop");
    }

    @Override
    public void shutDown() {
        System.out.println("Running shutDown in Laptop");
    }

    @Override
    public void processTask() {
        System.out.println("Running processTask in Laptop");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Running connectToInternet in Laptop");
    }

    @Override
    public void updateSoftware() {
        System.out.println("Running updateSoftware in Laptop");
    }
    public  void charge(){
        System.out.println("Running charge in Laptop");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", ramSize=" + ramSize +
                        ", hasTouchscreen=" + hasTouchscreen;
    }
}
