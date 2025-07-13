package com.xworkz.interfaces.internal;

public interface FlightBooking {

    void searchFlights();
    void bookFlight();
    void cancelFlight();
    default void checkStatus(){
        System.out.println("Running checkStatus in Flight");
    }
}
