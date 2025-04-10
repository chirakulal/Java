package com.xworkz.inheritence.external;


public class Truck {

    private String name;
    private int wheel;
    private int speedLimit;

    public Truck(String name,int wheel,int speedLimit){
        super();;
        this.speedLimit=speedLimit;
        this.name=name;
        this.wheel =wheel;
    }


    @Override
    public String toString() {
        return
                "name='" + name +
                ", wheel=" + wheel +
                ", speedLimit=" + speedLimit;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : "+super.hashCode());
        return 3;
    }
}
