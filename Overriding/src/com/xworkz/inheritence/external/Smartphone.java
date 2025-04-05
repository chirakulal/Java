package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Gadget;

public class Smartphone extends Gadget {

    public Smartphone(){
        super();
        System.out.println("no-argu const is running");
    }
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in Smartphone");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in Smartphone");
    }

    @Override
    public void charge() {
        System.out.println("Running charge in Smartphone");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Running connectToWiFi in Smartphone");
    }

    @Override
    public void updateSoftware() {
        System.out.println("Running updateSoftware in Smartphone");
    }

}
