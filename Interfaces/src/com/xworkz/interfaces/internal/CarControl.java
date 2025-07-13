package com.xworkz.interfaces.internal;

public interface CarControl {

    void startEngine();
    void drive();
    void stopCar();

    default void manageSpeed(){
        System.out.println("Running manageSpeed in CarControl");
    }
}
