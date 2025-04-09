package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Gadget;

public class Smartphone extends Gadget {

    private String brand;
    private int storage;
    private boolean has5G;


    public Smartphone(String brand, int storage, boolean has5G) {
        this.brand = brand;
        this.storage = storage;
        this.has5G = has5G;
    }
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in Smartphone");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in Smartphone");
    }

    @Override
    public void charge() {
        System.out.println("Running charge in Smartphone");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Running connectToWiFi in Smartphone");
    }

    @Override
    public void updateSoftware() {
        System.out.println("Running updateSoftware in Smartphone");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", storage=" + storage +
                ", has5G=" + has5G ;
    }
}
