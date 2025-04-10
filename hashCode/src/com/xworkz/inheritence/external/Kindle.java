package com.xworkz.inheritence.external;

public class Kindle  {
    private String model;
    private int storageCapacity;
    private boolean isBacklit;


    public Kindle(String model, int storageCapacity, boolean isBacklit) {
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.isBacklit = isBacklit;
    }


    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", isBacklit=" + isBacklit ;
    }

    @Override
    public int hashCode() {
        return 78;
    }
}
