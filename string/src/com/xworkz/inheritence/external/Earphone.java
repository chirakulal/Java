package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.AudioDevice;

public class Earphone extends AudioDevice {

    private String brand;
    private boolean isWireless;
    private int batteryLife;


    public Earphone(String brand, boolean isWireless, int batteryLife) {
        this.brand = brand;
        this.isWireless = isWireless;
        this.batteryLife = batteryLife;
    }
    @Override
    public void listen() {
        System.out.println("Running listen in Earphone");
    }

    @Override
    public void call() {
        System.out.println("Running call in Earphone");
    }

    @Override
    public void music() {
        System.out.println("Running music in Earphone");
    }

    @Override
    public void beats() {
        System.out.println("Running beats in Earphone");
    }

    @Override
    public void play() {
        System.out.println("Running play in Earphone");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", isWireless=" + isWireless +
                ", batteryLife=" + batteryLife ;
    }
}
