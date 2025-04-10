package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Headphones;

public class Boat extends Headphones {

    private String model;
    private int batteryLife;
    private boolean isWireless;


    public Boat(String model, int batteryLife, boolean isWireless) {
        this.model = model;
        this.batteryLife = batteryLife;
        this.isWireless = isWireless;
    }

    @Override
    public void playMusic() {
        System.out.println("Running playMusic in Boat");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Running pauseMusic in Boat");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Running increaseVolume in Boat");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Running decreaseVolume in Boat");
    }

    @Override
    public void charge() {
        System.out.println("Running charge in Boat");
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                        ", batteryLife=" + batteryLife +
                        ", isWireless=" + isWireless;
    }
}
