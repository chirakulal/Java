package com.xworkz.interfaces.internal;

public interface HealthCareApp {

    void bookAppointment();
    void viewReports();
    void contactDoctor();

    default void check(){
        System.out.println("Running check in HealthCare");
    }
}
