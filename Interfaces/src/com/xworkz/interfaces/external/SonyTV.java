package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Television;

public class SonyTV implements Television {

    @Override
    public void turnOn() {
        System.out.println("Running turnOn in SonyTV");
    }

    @Override
    public void changeChannel() {
        System.out.println("Running changeChannel in SonyTV");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in SonyTV");
    }

}
