package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.StorageDevice;

public class HardDisk extends StorageDevice {

    public HardDisk() {
        super();
        System.out.println("No-arg constructor is running in HardDrive");
    }

    @Override
    public void readData() {
        System.out.println("Running readData in HardDisk");
    }

    @Override
    public void writeData() {
        System.out.println("Running writeData in HardDisk");
    }

    @Override
    public void format() {
        System.out.println("Running format in HardDisk");
    }

    @Override
    public void eject() {
        System.out.println("Running eject in HardDisk");
    }

    @Override
    public void checkHealth() {
        System.out.println("Running checkHealth in HardDisk");
    }
}
