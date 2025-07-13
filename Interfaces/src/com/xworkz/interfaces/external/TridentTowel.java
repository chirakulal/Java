package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Towel;

public class TridentTowel implements Towel {

    @Override
    public void wipeFace() {
        System.out.println("Running wipeFace in TridentTowel");
    }

    @Override
    public void dryBody() {
        System.out.println("Running dryBody in TridentTowel");
    }

    @Override
    public void washTowel() {
        System.out.println("Running washTowel in TridentTowel");
    }

    @Override
    public void cleanTowel() {
        System.out.println("Running cleanTowel in cleantowel");

    }
}
