package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Vehicle;

public class Truck extends Vehicle {

    public Truck(){
        super();;
        System.out.println("no-argu constructor of Truck");
    }


    public void wheel(){
        System.out.println("Running wheel in Truck");
    }

    @Override
    public void stop(){
        System.out.println("Running stop in Truck");
    }
    @Override
    public void start(){
        System.out.println("Running start in Truck");
    }
    @Override
    public void brake(){
        System.out.println("Running brake in Truck");
    }
    @Override
    public void accelerate(){
        System.out.println("Running accelerate in Truck ");
    }
    @Override
    public void speed(){
        System.out.println("running speed in Truck");
    }
}
