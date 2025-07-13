package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Vehicle;

public class Truck implements Vehicle {

    @Override
    public void startEngine(){
        System.out.println("Running startEngine in TRuck");
    }

    @Override
    public void accelerate() {
        System.out.println("Running accelerate in Vehicle");
    }

    @Override
    public void stopEngine() {
        System.out.println("Running stopEngine in Truck");
    }

    @Override
    public void run() {
        System.out.println("Running run in Vehicle");

    }
}
