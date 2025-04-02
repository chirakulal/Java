package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Vehicle;

public class Ship extends Vehicle {

    public Ship(){
        super();
        System.out.println("no-arg const of Ship");
    }

    public void fishing(){
        System.out.println("Running fishing in Ship");
    }



}
