package com.xworkz.inheritence.external;


public class PlasticBucket  {
    private String color;
    private int capacity;
    private boolean hasHandle;

    public PlasticBucket(String color, int capacity, boolean hasHandle) {
        this.color = color;
        this.capacity = capacity;
        this.hasHandle = hasHandle;
    }



    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                        ", capacity=" + capacity +
                        ", hasHandle=" + hasHandle;
    }

    @Override
    public int hashCode() {
        return 93;
    }
}
