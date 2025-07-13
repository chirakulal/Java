package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.MapApp;

public class Waze implements MapApp {

    @Override
    public void locatePlace() {
        System.out.println("Running locatePlace in Waze");
    }

    @Override
    public void measureDistance() {
        System.out.println("Running measureDistance in Waze");
    }

    @Override
    public void saveLocation() {
        System.out.println("Running saveLocation in Waze");
    }

    @Override
    public void search() {
        System.out.println("Running search in MapApp");

    }
}
