package com.xworkz.interfaces.internal;

public interface RideHailing {

    void bookRide();
    void cancelRide();
    void rateDriver();
    default void travel(){
        System.out.println("Running in travel in RideHailing");
    }
}
