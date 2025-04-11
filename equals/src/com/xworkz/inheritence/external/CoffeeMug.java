package com.xworkz.inheritence.external;

public class CoffeeMug {
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
        return "color='" + color + '\'' +
                ", capacity=" + capacity +
                ", isMicrowaveSafe=" + isMicrowaveSafe;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 97;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof CoffeeMug) {
                CoffeeMug other = (CoffeeMug) obj;
                if (this.color.equals(other.color)) {
                    System.out.println("Both CoffeeMug objects are same based on color");
                    return true;
                }
            }
        }
        return false;
    }
}
