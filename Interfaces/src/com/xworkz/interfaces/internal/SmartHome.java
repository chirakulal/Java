package com.xworkz.interfaces.internal;

public interface SmartHome {

    void turnLightsOn();
    void adjustThermostat();
    void lockDoors();

    default void onLight(){
        System.out.println("Running onLight in SmartHome");
    }

}
