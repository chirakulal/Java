package com.xworkz.inheritence.external;

public class Rose{
    private String color;
    private int petalCount;
    private boolean hasFragrance;


    public Rose(String color, int petalCount, boolean hasFragrance) {
        this.color = color;
        this.petalCount = petalCount;
        this.hasFragrance = hasFragrance;
    }


    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", petalCount=" + petalCount +
                ", hasFragrance=" + hasFragrance;
    }

    @Override
    public int hashCode() {
        return 41;
    }
}
