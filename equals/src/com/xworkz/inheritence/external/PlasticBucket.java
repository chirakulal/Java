package com.xworkz.inheritence.external;

public class PlasticBucket {
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
        return "color='" + color + '\'' +
                ", capacity=" + capacity +
                ", hasHandle=" + hasHandle;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 93;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof PlasticBucket) {
                PlasticBucket other = (PlasticBucket) obj;
                if (this.color.equals(other.color)) {
                    System.out.println("Both PlasticBucket objects are same based on color");
                    return true;
                }
            }
        }
        return false;
    }
}
