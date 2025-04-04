package com.xworkz.inheritence.internal;

public class Gadget {

    public Gadget() {
        System.out.println("No-arg constructor is running in Gadget");
    }

    public void turnOn() {
        System.out.println("Turning on the gadget");
    }
    public void turnOff() {
        System.out.println("Turning off the gadget");
    }
    public void charge() {
        System.out.println("Charging the gadget");
    }
    public void connectToWiFi() {
        System.out.println("Connecting to WiFi");
    }
    public void updateSoftware() {
        System.out.println("Updating software");
    }
}
