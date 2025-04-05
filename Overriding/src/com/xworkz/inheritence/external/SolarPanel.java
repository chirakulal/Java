package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.EnergySource;

public class SolarPanel extends EnergySource {

    public SolarPanel() {
        super();
        System.out.println("No-arg constructor is running in SolarPanel");
    }
    @Override
    public void generatePower() {
        System.out.println("Running generatePower in SolarPanel");
    }

    @Override
    public void storeEnergy() {
        System.out.println("Running storeEnergy in SolarPanel");
    }

    @Override
    public void distributeEnergy() {
        System.out.println("Running distributeEnergy in SolarPanel");
    }

    @Override
    public void reduceCarbonFootprint() {
        System.out.println("Running reduceCarbonFootprint in SolarPanel");
    }


@Override
    public void maintain() {
        System.out.println("Running maintain in SolarPanel");
    }

}
