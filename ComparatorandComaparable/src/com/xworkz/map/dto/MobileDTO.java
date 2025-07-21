package com.xworkz.map.dto;

public class MobileDTO {
    private String model;
    private int batteryLife;

    public MobileDTO(String model, int batteryLife) {
        this.model = model;
        this.batteryLife = batteryLife;
    }

    public String toString() {
        return "Mobile{model='" + model + "', batteryLife=" + batteryLife + " hrs}";
    }

    public int getBatteryLife() {
        return batteryLife;
    }
}

