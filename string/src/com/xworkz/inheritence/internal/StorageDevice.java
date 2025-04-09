package com.xworkz.inheritence.internal;

public class StorageDevice {

    public StorageDevice() {
        System.out.println("No-arg const is running in StorageDevice");
    }

    public void readData() {
        System.out.println("Running readData in StorageDevice");
    }

    public void writeData() {
        System.out.println("Running writeData in StorageDevice");
    }

    public void format() {
        System.out.println("Running format in StorageDevice");
    }

    public void eject() {
        System.out.println("Running eject in StorageDevice");
    }

    public void checkHealth() {
        System.out.println("Running checkHealth in StorageDevice");
    }

}

