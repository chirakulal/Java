package com.xworkz.javareferenceandvariable;

public class Transport {
     String mode;
     int capacity;
    String fuelType;
   int speed;

    // Constructor
    public Transport(String mode, int capacity, String fuelType, int speed) {
        this.mode = mode;
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.speed = speed;
        System.out.println(this.mode+" "+this.capacity+" "+this.fuelType+" "+this.speed);
    }
    void display(){
        System.out.println("Running display in Transport");
    }

}
