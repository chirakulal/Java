package com.xworkz.inheritence.external;

public class WashingMachine {
    private String brand;
    private int loadCapacity;
    private boolean isFrontLoad;

    public WashingMachine(String brand, int loadCapacity, boolean isFrontLoad) {
        this.brand = brand;
        this.loadCapacity = loadCapacity;
        this.isFrontLoad = isFrontLoad;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", loadCapacity=" + loadCapacity +
                ", isFrontLoad=" + isFrontLoad;
    }

    @Override
    public int hashCode() {
        return 99;
    }
}
}
