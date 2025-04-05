package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Light;

public class LEDBulb extends Light {
    public LEDBulb(){
        super();
        System.out.println("no-argu constructor is running");
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

}
