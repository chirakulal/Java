package com.xworkz.interfaces.internal;

public interface CalendarApp {


    void addEvent();
    void deleteEvent();
    void viewSchedule();

    default void event(){
        System.out.println("running CalenderApp");
    }



}
