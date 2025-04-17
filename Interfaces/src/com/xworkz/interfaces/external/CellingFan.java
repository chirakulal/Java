package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Fan;

public class CellingFan implements Fan {

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in CellingFan");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Running in adjustSpeed in CeelingFan");
    }

    @Override
    public void turnOn() {
        System.out.println("Running tunOn in CeelingFan");
    }
}
