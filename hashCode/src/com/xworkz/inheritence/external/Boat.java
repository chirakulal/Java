package com.xworkz.inheritence.external;



public class Boat {

    private String model;
    private int batteryLife;
    private boolean isWireless;


    public Boat(String model, int batteryLife, boolean isWireless) {
        this.model = model;
        this.batteryLife = batteryLife;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                        ", batteryLife=" + batteryLife +
                        ", isWireless=" + isWireless;
    }

    @Override
    public int hashCode() {
        return 83;
    }
}
