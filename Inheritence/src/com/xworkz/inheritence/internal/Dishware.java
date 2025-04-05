package com.xworkz.inheritence.internal;

public class Dishware {

    public Dishware() {
        System.out.println("No-arg constructor is running in Dishware");
    }

    public void serveFood() {
        System.out.println("Serving food on dishware");
    }
    public void clean() {
        System.out.println("Cleaning dishware");
    }
    public void stack() {
        System.out.println("Stacking dishware");
    }
    public void store() {
        System.out.println("Storing dishware in cabinets");
    }
    public void breakIfDropped() {
        System.out.println("Breaking if dropped");
    }
}
