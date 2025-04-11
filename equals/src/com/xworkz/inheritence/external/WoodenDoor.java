package com.xworkz.inheritence.external;

public class WoodenDoor {
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
                        ", woodType='" + woodType + '\'';
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 61;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof WoodenDoor) {
                WoodenDoor woodendoor = (WoodenDoor) obj;
                if (this.height == woodendoor.height
                        && this.width == woodendoor.width) {
                    System.out.println("Both WoodenDoor objects are same based on height and width");
                    return true;
                }
            }
        }
        return false;
    }
}
