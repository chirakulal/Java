package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.HealthCareApp;

public class Practo implements HealthCareApp {


    @Override
    public void bookAppointment() {
        System.out.println("Running bookAppointment in Practo");
    }

    @Override
    public void viewReports() {
        System.out.println("Running viewReports in Practo");
    }

    @Override
    public void contactDoctor() {
        System.out.println("Running contactDoctor in Practo");
    }

}
