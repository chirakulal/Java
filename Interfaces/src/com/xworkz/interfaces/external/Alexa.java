package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.SmartHome;

public class Alexa implements SmartHome {

    @Override
    public void turnLightsOn() {
        System.out.println("Running turnLightsOn in Alexa");
    }

    @Override
    public void adjustThermostat() {
        System.out.println("Running adjustThermostat in Alexa");
    }

    @Override
    public void lockDoors() {
        System.out.println("Running lockDoors in Alexa");
    }

    @Override
    public void onLight() {
        System.out.println("Running onLight in SmartHome");

    }
}
