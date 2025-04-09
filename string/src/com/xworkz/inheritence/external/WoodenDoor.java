package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Door;

public class WoodenDoor extends Door {
    private int height;
    private int width;
    private String woodType;


    public WoodenDoor(int height, int width, String woodType) {
        this.height = height;
        this.width = width;
        this.woodType = woodType;
    }
    @Override
    public void open() {
        System.out.println("Running open in WoodenDoor");
    }

    @Override
    public void close() {
        System.out.println("Running close in WoodenDoor");
    }

    @Override
    public void lock() {
        System.out.println("Running lock in WoodenDoor");
    }

    @Override
    public void unlock() {
        System.out.println("Running unlock in WoodenDoor");
    }

    @Override
    public void material() {
        System.out.println("Running material in WoodenDoor");
    }

    @Override
    public String toString() {
        return
                "height=" + height +
                ", width=" + width +
                ", woodType='" + woodType;
    }
}
