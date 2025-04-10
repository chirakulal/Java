package com.xworkz.inheritence.external;


public class Laptop  {

    private String brand;
    private int ramSize;
    private boolean hasTouchscreen;


    public Laptop(String brand, int ramSize, boolean hasTouchscreen) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.hasTouchscreen = hasTouchscreen;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", ramSize=" + ramSize +
                        ", hasTouchscreen=" + hasTouchscreen;
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
