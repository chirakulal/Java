package com.xworkz.inheritence.internal;

public class Timepiece {

    public Timepiece() {
        System.out.println("No-arg const is running in Timepiece");
    }

    public void displayTime() {
        System.out.println("Displaying time");
    }
    public void setAlarm() {
        System.out.println("Setting an alarm");
    }
    public void adjustTime() {
        System.out.println("Adjusting time");
    }
    public void startTimer() {
        System.out.println("Starting the timer");
    }
    public void checkBattery() {
        System.out.println("Checking battery level");
    }
}
