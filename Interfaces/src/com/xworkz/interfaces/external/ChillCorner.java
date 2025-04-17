package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Fan;
import com.xworkz.interfaces.internal.Restaurant;

public class ChillCorner implements Fan, Restaurant {

    @Override
    public void turnOn() {
        System.out.println("Running method in ChillCorner");
    }

    @Override
    public void turnOff() {
        System.out.println("Running method in ChillCorner");

    }

    @Override
    public void adjustSpeed() {
        System.out.println("Running method in ChillCorner");

    }

    @Override
    public void generateBill() {
        System.out.println("Running method in ChillCorner");

    }

    @Override
    public void serveFood() {
        System.out.println("Running method in ChillCorner");

    }

    @Override
    public void takeOrder() {
        System.out.println("Running method in ChillCorner");

    }
}
