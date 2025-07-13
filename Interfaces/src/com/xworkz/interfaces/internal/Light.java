package com.xworkz.interfaces.internal;

public interface Light {

    void turnOn();
    void turnOff();
    void adjustBrightness();

    default void capacity(){
        System.out.println("Running capacity in Light");
    }
}
