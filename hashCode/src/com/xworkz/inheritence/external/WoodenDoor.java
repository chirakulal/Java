package com.xworkz.inheritence.external;


public class WoodenDoor  {
    private int height;
    private int width;
    private String woodType;


    public WoodenDoor(int height, int width, String woodType) {
        this.height = height;
        this.width = width;
        this.woodType = woodType;
    }

    @Override
    public String toString() {
        return
                "height=" + height +
                ", width=" + width +
                ", woodType='" + woodType;
    }

    @Override
    public int hashCode() {
        return 61;
    }
}
