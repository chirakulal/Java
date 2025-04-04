package com.xworkz.inheritence.internal;

public class Clock {
    public Clock() {
        System.out.println("No-arg const is running in Clock");
    }

    public void showTime() {
        System.out.println("Displaying the current time");
    }
    public void setAlarm() {
        System.out.println("Setting an alarm");
    }
    public void tick() {
        System.out.println("Clock is ticking");
    }
    public void stopClock() {
        System.out.println("Stopping the clock");
    }
    public void resetClock() {
        System.out.println("Resetting the clock");
    }
}
