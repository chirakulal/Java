package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Fan;
import com.xworkz.interfaces.internal.Light;

public class LivingRoomSetup implements Fan, Light {

    @Override
    public void turnOn() {
        System.out.println("Running method in turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Running method tornOff");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Running method in MourningRoutine");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Running method in MourningRoutine");

    }

}
