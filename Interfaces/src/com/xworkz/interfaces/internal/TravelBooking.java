package com.xworkz.interfaces.internal;

public interface TravelBooking {

    void bookTicket();
    void cancelTicket();
    void checkStatus();
    default void TRavel(){
        System.out.println("Running travel in TravelBooking");
    }
}
