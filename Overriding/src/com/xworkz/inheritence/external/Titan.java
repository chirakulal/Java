package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Watches;

public class Titan extends Watches {
    public Titan(){
        super();
        System.out.println("No-arg constructor running in Titan");
    }

    @Override
    public void showTime() {
        System.out.println("Running showTime in Titan");
    }
    @Override
    public void setAlarm() {
        System.out.println("Running setAlarm in Titan");
    }
    @Override
    public void showDate() {
        System.out.println("Running showDate in Titan");
    }
    @Override
    public void changeStrap() {
        System.out.println("Running changeStrap in Titan");
    }
    @Override
    public void checkBattery() {
        System.out.println("Running checkBattery in Titan");
    }
}
