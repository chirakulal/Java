package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Vehicle;

public class Truck extends Vehicle {

    private String name;
    private int wheel;
    private int speedLimit;

    public Truck(String name,int wheel,int speedLimit){
        super();;
        this.speedLimit=speedLimit;
        this.name=name;
        this.wheel =wheel;
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

    @Override
    public String toString() {
        return
                "name='" + name +
                ", wheel=" + wheel +
                ", speedLimit=" + speedLimit;
    }
}
