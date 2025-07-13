package com.xworkz.interfaces.internal;

public interface TicketBooking {
    void searchTickets();
    void bookTicket();
    void cancelTicket();

    default void booking(){
        System.out.println("Running booking in TicketBooking");
    }
}
