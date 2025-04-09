package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.StorageDevice;

public class HardDisk extends StorageDevice {
    private String capacity;
    private String type;
    private boolean isExternal;

    public HardDisk(String capacity, String type, boolean isExternal) {
        this.capacity = capacity;
        this.type = type;
        this.isExternal = isExternal;
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
    public  void delete(){
        System.out.println("Running delete in HardDisk");
    }

    @Override
    public String toString() {
        return
                "capacity='" + capacity + '\'' +
                        ", type='" + type + '\'' +
                        ", isExternal=" + isExternal;
    }
}
