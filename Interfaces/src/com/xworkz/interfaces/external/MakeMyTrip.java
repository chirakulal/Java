package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.TravelBooking;

public class MakeMyTrip implements TravelBooking {

    @Override
    public void bookTicket() {
        System.out.println("Running bookTicket in MakeMyTrip");
    }
    @Override
    public void cancelTicket() {
        System.out.println("Running cancelTicket in MakeMyTrip");
    }
    @Override
    public void checkStatus() {
        System.out.println("Running checkStatus in MakeMyTrip");
    }
}
