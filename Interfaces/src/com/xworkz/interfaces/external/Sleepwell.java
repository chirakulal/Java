package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Pillow;

public class Sleepwell implements Pillow {

    @Override
    public void fluffPillow() {
        System.out.println("Running fluffPillow in Sleepwell");
    }

    @Override
    public void coverPillow() {
        System.out.println("Running coverPillow in Sleepwell");
    }

    @Override
    public void washPillow() {
        System.out.println("Running washPillow in Sleepwell");
    }

    @Override
    public void HelpsTosleep() {
        System.out.println("Running HelpsTosleep in Sleepwell");

    }
}
