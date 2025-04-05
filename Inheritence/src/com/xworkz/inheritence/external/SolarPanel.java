package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.EnergySource;

public class SolarPanel extends EnergySource {

    public SolarPanel() {
        super();
        System.out.println("No-arg constructor is running in SolarPanel");
    }
}
