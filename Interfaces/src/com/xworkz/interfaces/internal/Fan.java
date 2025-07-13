package com.xworkz.interfaces.internal;

public interface Fan {

    void turnOn();
    void turnOff();
    void adjustSpeed();

    default void capacitor(){
        System.out.println("Running capacitor in Fan");
    }

}
