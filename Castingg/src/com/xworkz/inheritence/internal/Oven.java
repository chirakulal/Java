package com.xworkz.inheritence.internal;

public class Oven {
    public Oven() {
        System.out.println("No-arg constructor in Oven");
    }

    public void preheat() {
        System.out.println("Running preheat in Oven");
    }
    public void bake() {
        System.out.println("Running bake in Oven");
    }
    public void grill() {
        System.out.println("Running grill in Oven");
    }
    public void defrost() {
        System.out.println("Running defrost in Oven");
    }
    public void turnOff() {
        System.out.println("Running turnOff in Oven");
    }
}
