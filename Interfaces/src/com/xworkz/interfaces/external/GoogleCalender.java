package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.CalendarApp;

public class GoogleCalender implements CalendarApp {

    @Override
    public void addEvent() {
        System.out.println("Running addEvent in GoogleCalendar");
    }

    @Override
    public void deleteEvent() {
        System.out.println("Running deleteEvent in GoogleCalendar");
    }

    @Override
    public void viewSchedule() {
        System.out.println("Running viewSchedule in GoogleCalendar");
    }

}
