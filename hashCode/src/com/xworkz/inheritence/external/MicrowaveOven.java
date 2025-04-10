package com.xworkz.inheritence.external;


public class MicrowaveOven  {
    private String brand;
    private int capacity;
    private boolean hasGrillFunction;


    public MicrowaveOven(String brand, int capacity, boolean hasGrillFunction) {
        this.brand = brand;
        this.capacity = capacity;
        this.hasGrillFunction = hasGrillFunction;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", hasGrillFunction=" + hasGrillFunction ;
    }

    @Override
    public int hashCode() {
        return 98;
    }
}
