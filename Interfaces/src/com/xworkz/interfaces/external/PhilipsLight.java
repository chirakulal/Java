package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Light;

public class PhilipsLight implements Light {

    @Override
    public void turnOn() {
        System.out.println("Running turnOn in PhilipsLight");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in PhilipsLight");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Running adjustBrightness in PhilipsLight");
    }

}
