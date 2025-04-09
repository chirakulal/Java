package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Light;

public class LEDBulb extends Light {
    private int wattage;
    private int colorTemperature;
    private boolean isDimmable;


    public LEDBulb(int wattage, int colorTemperature, boolean isDimmable) {
        this.wattage = wattage;
        this.colorTemperature = colorTemperature;
        this.isDimmable = isDimmable;
    }
    @Override
    public void emitLight() {
        System.out.println("Running emitLight in LEDBulb");
    }

    @Override
    public void turnOn() {
        System.out.println("Running turnOn in LEDBulb");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in LEDBulb");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Running adjustBrightness in LEDBulb");
    }

    @Override
    public void saveEnergy() {
        System.out.println("Running saveEnergy in LEDBulb");
    }

    public void voltage(){
        System.out.println("Running volatage in LEDBulb");
    }

    @Override
    public String toString() {
        return
                "wattage=" + wattage +
                ", colorTemperature=" + colorTemperature +
                ", isDimmable=" + isDimmable;
    }
}
