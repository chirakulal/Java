package com.xworkz.inheritence.external;

public class Earphone  {

    private String brand;
    private boolean isWireless;
    private int batteryLife;


    public Earphone(String brand, boolean isWireless, int batteryLife) {
        this.brand = brand;
        this.isWireless = isWireless;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", isWireless=" + isWireless +
                ", batteryLife=" + batteryLife ;
    }

    @Override
    public int hashCode() {
        return 56;
    }
}
