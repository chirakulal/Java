package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Bottle;
import com.xworkz.interfaces.internal.Towel;

public class TravelKit implements Bottle, Towel {

    @Override
    public void wipeFace() {
        System.out.println("Running wipeFace in TRavelKit");
    }

    @Override
    public void drinkWater() {
        System.out.println("Running drinkWater in TravelKit");
    }

    @Override
    public void dryBody() {
        System.out.println("Running dryBOdy in TRavelKit");
    }

    @Override
    public void fillWater() {
        System.out.println("Running fillWater in TravelKIt");
    }

    @Override
    public void washBottle() {
        System.out.println("Running washBottle in WashBottle ");
    }


    @Override
    public void washTowel() {
        System.out.println("Runninh washTowel in TravelKit");
    }
}
