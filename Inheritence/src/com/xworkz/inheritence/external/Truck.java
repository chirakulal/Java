package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Vehicle;

public class Truck extends Vehicle {

    public Truck(){
        super();;
        System.out.println("no-argu constructor of Truck");
    }

    public void Wheel(){
        System.out.println("Running wheel in Truck");
    }
}
