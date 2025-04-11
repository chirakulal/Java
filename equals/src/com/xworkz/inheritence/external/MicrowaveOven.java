package com.xworkz.inheritence.external;

public class MicrowaveOven {
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
        return "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", hasGrillFunction=" + hasGrillFunction;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 98;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof MicrowaveOven) {
                MicrowaveOven other = (MicrowaveOven) obj;
                if (this.brand.equals(other.brand)) {
                    System.out.println("Both MicrowaveOven objects are same based on brand");
                    return true;
                }
            }
        }
        return false;
    }
}
