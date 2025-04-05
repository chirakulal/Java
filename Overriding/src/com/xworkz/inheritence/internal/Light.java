package com.xworkz.inheritence.internal;

public class Light {

    public Light(){
        System.out.println("No-arg constructor is running in LightSource");
    }

    public void emitLight() {
        System.out.println("Running emitLight in LightSource");
    }

    public void turnOn() {
        System.out.println("Running turnOn in LightSource");
    }

    public void turnOff() {
        System.out.println("Running turnOff in LightSource");
    }

    public void adjustBrightness() {
        System.out.println("Running adjustBrightness in LightSource");
    }

    public void saveEnergy() {
        System.out.println("Running saveEnergy in LightSource");
    }

}
