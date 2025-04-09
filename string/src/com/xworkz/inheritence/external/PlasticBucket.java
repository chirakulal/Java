package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Bucket;

public class PlasticBucket extends Bucket {
    private String color;
    private int capacity;
    private boolean hasHandle;

    public PlasticBucket(String color, int capacity, boolean hasHandle) {
        this.color = color;
        this.capacity = capacity;
        this.hasHandle = hasHandle;
    }

    @Override
    public void fillWater() {
        System.out.println("Running fillWater in PlasticBucket");
    }
    @Override
    public void empty() {
        System.out.println("Running empty in PlasticBucket");
    }
    @Override
    public void carry() {
        System.out.println("Running carry in PlasticBucket");
    }
    @Override
    public void clean() {
        System.out.println("Running clean in PlasticBucket");
    }
    @Override
    public void store() {
        System.out.println("Running store in PlasticBucket");
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                        ", capacity=" + capacity +
                        ", hasHandle=" + hasHandle;
    }
}
