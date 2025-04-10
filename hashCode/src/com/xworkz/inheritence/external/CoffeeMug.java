package com.xworkz.inheritence.external;

public class CoffeeMug  {
    private String color;
    private int capacity;
    private boolean isMicrowaveSafe;


    public CoffeeMug(String color, int capacity, boolean isMicrowaveSafe) {
        this.color = color;
        this.capacity = capacity;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", capacity=" + capacity +
                ", isMicrowaveSafe=" + isMicrowaveSafe ;
    }

    @Override
    public int hashCode() {
        return 97;
    }
}
