package com.xworkz.interfaces.internal;

public interface SmartWatches {

    void showTime();
    void trackSteps();
    void monitorHeartRate();

    default void call(){
        System.out.println("Running call in SmartWatches");
    }
}
