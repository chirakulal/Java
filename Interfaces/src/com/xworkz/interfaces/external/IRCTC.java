package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.TicketBooking;

public class IRCTC implements TicketBooking {


    @Override
    public void searchTickets() {
        System.out.println("Running searchTickets in IRCTC");
    }

    @Override
    public void bookTicket() {
        System.out.println("Running bookTicket in IRCTC");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Running cancelTicket in IRCTC");
    }
}
