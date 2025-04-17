package com.xworkz.interfaces.internal;

public interface Vehicle {

    void startEngine();
    void stopEngine();
    void accelerate();

    default void run(){
        System.out.println("Running run in Vehicle");
    }
}
