package com.xworkz.interfaces.internal;

public interface Thermostat {

    void setTemperature();
    void increaseTemperature();
    void decreaseTemperature();

    default void checkTemperature(){
        System.out.println("running checkTemperature in Thermostat");
    }
}
