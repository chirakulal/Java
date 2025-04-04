package com.xworkz.inheritence.internal;

public class StorageDevice {

    public StorageDevice() {
        System.out.println("No-arg const is running in StorageDevice");
    }

    public void readData()
    {
        System.out.println("Reading data");
    }
    public void writeData() {
        System.out.println("Writing data");
    }
    public void format() {
        System.out.println("Formatting storage device");
    }
    public void eject() {
        System.out.println("Ejecting storage device");
    }
    public void checkHealth() {
        System.out.println("Checking storage health");
    }
}

