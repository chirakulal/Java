package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Thermostat;

public class NestThermostat implements Thermostat {


    @Override
    public void setTemperature() {
        System.out.println("Running setTemperature in NestThermostat");
    }

    @Override
    public void decreaseTemperature() {
        System.out.println("Running decresaseTemperature in NestThermostat");
    }

    @Override
    public void increaseTemperature() {
        System.out.println("Running increaseTemperature in NestThermostat");
    }

    @Override
    public void checkTemperature() {

            System.out.println("running checkTemperature in Thermostat");

    }
}
