package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Bottle;

public class MiltonBottle implements Bottle {

    @Override
    public void fillWater() {
        System.out.println("Running fillWater in MiltonBottle");
    }

    @Override
    public void drinkWater() {
        System.out.println("Running drinkWater in MiltonBottle");
    }

    @Override
    public void washBottle() {
        System.out.println("Running washBottle in MiltonBottle");
    }
}
