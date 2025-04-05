package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Timepiece;

public class Watch extends Timepiece {

    public Watch() {
        super();
        System.out.println("No-arg constructor is running in Watch");
    }
    @Override
    public void displayTime() {
        System.out.println("Running displayTime in Watch");
    }

    @Override
    public void setAlarm() {
        System.out.println("Running setAlarm in Watch");
    }

    @Override
    public void adjustTime() {
        System.out.println("Running adjustTime in Watch");
    }

    @Override
    public void startTimer() {
        System.out.println("Running startTimer in Watch");
    }

    @Override
    public void checkBattery() {
        System.out.println("Running checkBattery in Watch");
    }

}
