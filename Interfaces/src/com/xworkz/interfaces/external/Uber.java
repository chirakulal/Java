package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.RideHailing;

public class Uber implements RideHailing {

    @Override
    public void bookRide() {
        System.out.println("Running bookRide in Uber");
    }

    @Override
    public void cancelRide() {
        System.out.println("Running cancelRide in Uber");
    }

    @Override
    public void rateDriver() {
        System.out.println("Running rateDriver in Uber");
    }
}
