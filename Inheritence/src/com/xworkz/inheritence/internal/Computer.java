package com.xworkz.inheritence.internal;

public class Computer {

    public Computer() {
        System.out.println("No-arg constructor is running in Computer");
    }

    public void bootUp() {
        System.out.println("Booting up the computer");
    }
    public void shutDown() {
        System.out.println("Shutting down the computer");
    }
    public void processTask() {
        System.out.println("Processing a task");
    }
    public void connectToInternet() {
        System.out.println("Connecting to the internet");
    }
    public void updateSoftware() {
        System.out.println("Updating software");
    }
}
