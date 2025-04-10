package com.xworkz.inheritence.external;
;

public class JBL  {
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
                ", isWaterproof=" + isWaterproof ;
    }

    @Override
    public int hashCode() {
        return 81;
    }
}
