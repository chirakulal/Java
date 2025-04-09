package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Mug;

public class CoffeeMug extends Mug {
    private String color;
    private int capacity;
    private boolean isMicrowaveSafe;


    public CoffeeMug(String color, int capacity, boolean isMicrowaveSafe) {
        this.color = color;
        this.capacity = capacity;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public void pour() {
        System.out.println("Running pour in CoffeeMug");
    }
    @Override
    public void sip() {
        System.out.println("Running sip in CoffeeMug");
    }
    @Override
    public void clean() {
        System.out.println("Running clean in CoffeeMug");
    }
    @Override
    public void heat() {
        System.out.println("Running heat in CoffeeMug");
    }
    @Override
    public void refill() {
        System.out.println("Running refill in CoffeeMug");
    }
    public void taste(){
        System.out.println("Running taste in CoffeeMug");
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", capacity=" + capacity +
                ", isMicrowaveSafe=" + isMicrowaveSafe ;
    }
}
