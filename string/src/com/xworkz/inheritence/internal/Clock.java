package com.xworkz.inheritence.internal;

public class Clock {
    public Clock() {
        System.out.println("No-arg const is running in Clock");
    }

    public void showTime() {
        System.out.println("Running showTime in Clock");
    }

    public void setAlarm() {
        System.out.println("Running setAlarm in Clock");
    }

    public void tick() {
        System.out.println("Running tick in Clock");
    }

    public void stopClock() {
        System.out.println("Running stopClock in Clock");
    }

    public void resetClock() {
        System.out.println("Running resetClock in Clock");
    }

}
