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
        return "model='" + model + '\'' +
                ", batteryLife=" + batteryLife +
                ", isWireless=" + isWireless;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 83;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Boat) {
                Boat other = (Boat) obj;
                if (this.model.equals(other.model)) {
                    System.out.println("Both Boat objects are same based on model");
                    return true;
                }
            }
        }
        return false;
    }
}
