package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Timepiece;

public class Watch extends Timepiece {

    private String brand;
    private boolean isDigital;
    private boolean waterResistant;


    public Watch(String brand, boolean isDigital, boolean waterResistant) {
        this.brand = brand;
        this.isDigital = isDigital;
        this.waterResistant = waterResistant;
    }
    @Override
    public void displayTime() {
        System.out.println("Running displayTime in Watch");
    }

    @Override
    public void setAlarm() {
        System.out.println("Running setAlarm in Watch");
    }

    @Override
    public void adjustTime() {
        System.out.println("Running adjustTime in Watch");
    }

    @Override
    public void startTimer() {
        System.out.println("Running startTimer in Watch");
    }

    @Override
    public void checkBattery() {
        System.out.println("Running checkBattery in Watch");
    }
    public void call(){
        System.out.println("Running call in Watch");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", isDigital=" + isDigital +
                ", waterResistant=" + waterResistant ;
    }
}
