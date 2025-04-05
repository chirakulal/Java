package com.xworkz.inheritence.internal;

public class Mug {
    public Mug() {
        System.out.println("No-arg constructor in Mug");
    }

    public void pour() { System.out.println("Running pour in Mug"); }
    public void sip() { System.out.println("Running sip in Mug"); }
    public void clean() { System.out.println("Running clean in Mug"); }
    public void heat() { System.out.println("Running heat in Mug"); }
    public void refill() { System.out.println("Running refill in Mug"); }
}
