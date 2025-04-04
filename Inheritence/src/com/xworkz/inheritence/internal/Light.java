package com.xworkz.inheritence.internal;

public class Light {

    public Light(){
        System.out.println("No-arg constructor is running in LightSource");
    }

    public void emitLight() {
        System.out.println("Emitting light");
    }
    public void turnOn() {
        System.out.println("Turning on the light source");
    }
    public void turnOff() {
        System.out.println("Turning off the light source");
    }
    public void adjustBrightness() {
        System.out.println("Adjusting brightness");
    }
    public void saveEnergy() {
        System.out.println("Saving energy");
    }
}
