package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Speaker;

public class JBL extends Speaker {
    private String model;
    private int batteryLife;
    private boolean isWaterproof;


    public JBL(String model, int batteryLife, boolean isWaterproof) {
        this.model = model;
        this.batteryLife = batteryLife;
        this.isWaterproof = isWaterproof;
    }
    @Override
    public void playSound() {
        System.out.println("Running playSound in JBL");
    }
    @Override
    public void connectBluetooth() {
        System.out.println("Running connectBluetooth in JBL");
    }
    @Override
    public void adjustVolume() {
        System.out.println("Running adjustVolume in JBL");
    }
    @Override
    public void charge() {
        System.out.println("Running charge in JBL");
    }
    @Override
    public void turnOff() {
        System.out.println("Running turnOff in JBL");
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", batteryLife=" + batteryLife +
                ", isWaterproof=" + isWaterproof ;
    }
}
