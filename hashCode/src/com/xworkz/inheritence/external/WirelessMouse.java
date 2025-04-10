package com.xworkz.inheritence.external;

public class WirelessMouse  {
    private String brand;
    private int batteryLife;
    private int dpi;


    public WirelessMouse(String brand, int batteryLife, int dpi) {
        this.brand = brand;
        this.batteryLife = batteryLife;
        this.dpi = dpi;
    }


    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", batteryLife=" + batteryLife +
                ", dpi=" + dpi ;
    }

    @Override
    public int hashCode() {
        return 92;
    }
}
