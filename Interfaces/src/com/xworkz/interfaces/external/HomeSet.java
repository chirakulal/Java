package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Curtain;
import com.xworkz.interfaces.internal.Light;

public class HomeSet implements Curtain, Light {

    @Override
    public void adjustBrightness() {
        System.out.println("Running method in HomeSet");
    }

    @Override
    public void turnOff() {
        System.out.println("Running method in HomeSet");

    }

    @Override
    public void cleanCurtain() {
        System.out.println("Running method in HomeSet");

    }

    @Override
    public void closeCurtain() {
        System.out.println("Running method in HomeSet");

    }

    @Override
    public void openCurtain() {
        System.out.println("Running method in HomeSet");

    }

    @Override
    public void turnOn() {
        System.out.println("Running method in HomeSet");

    }
}
