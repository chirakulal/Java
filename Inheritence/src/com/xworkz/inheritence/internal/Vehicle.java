package com.xworkz.inheritence.internal;

public class Vehicle {

    public Vehicle(){
        System.out.println("no-argu const is running");
    }

    public void stop(){
        System.out.println("Running stop in Vehicle");
    }

    public void start(){
        System.out.println("Running start in Vehicle");
    }
    public void brake(){
        System.out.println("Running brake in Vehicle");
    }
    public void accelerate(){
        System.out.println("Running accelerate in Vehicle ");
    }
    public void speed(){
        System.out.println("running speed in Vehicle");
    }
}
