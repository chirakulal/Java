package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Mug;

public class CoffeeMug extends Mug {
    public CoffeeMug() {
        super();
        System.out.println("No-arg constructor in CoffeeMug");
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
}
