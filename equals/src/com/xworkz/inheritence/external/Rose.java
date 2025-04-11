package com.xworkz.inheritence.external;

public class Rose {
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
        System.out.println("Parent :" + super.hashCode());
        return 41;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Rose) {
                Rose rose1 = this;
                Rose rose2 = (Rose) obj;
                if (rose1.color.equals(rose2.color) && rose1.hasFragrance == rose2.hasFragrance) {
                    System.out.println("Both are same based on color and fragrance");
                    return true;
                }
            }
        }
        return false;
    }
}
