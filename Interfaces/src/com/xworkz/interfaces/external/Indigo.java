package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.FlightBooking;

public class Indigo implements FlightBooking {

    @Override
    public void searchFlights() {
        System.out.println("Running searchFlights in Indigo");
    }

    @Override
    public void bookFlight() {
        System.out.println("Running bookFlight in Indigo");
    }

    @Override
    public void cancelFlight() {
        System.out.println("Running cancelFlight in Indigo");
    }
}
