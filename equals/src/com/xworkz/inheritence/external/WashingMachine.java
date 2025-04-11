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
        System.out.println("Parent : " + super.hashCode());
        return 99;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof WashingMachine) {
                WashingMachine other = (WashingMachine) obj;
                if (this.brand.equals(other.brand)) {
                    System.out.println("Both WashingMachine objects are same based on brand");
                    return true;
                }
            }
        }
        return false;
    }
}
