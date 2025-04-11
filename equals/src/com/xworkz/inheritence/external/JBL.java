package com.xworkz.inheritence.external;

public class JBL {
    private String model;
    private int batteryLife;
    private boolean isWaterproof;

    public JBL(String model, int batteryLife, boolean isWaterproof) {
        this.model = model;
        this.batteryLife = batteryLife;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                        ", batteryLife=" + batteryLife +
                        ", isWaterproof=" + isWaterproof;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 81;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof JBL) {
                JBL other = (JBL) obj;
                if (this.model.equals(other.model)) {
                    System.out.println("Both JBL objects are same based on model");
                    return true;
                }
            }
        }
        return false;
    }
}
