package com.xworkz.inheritence.external;

public class Shirt {

    private String size;
    private String color;
    private boolean isFullSleeve;

    public Shirt(String size, String color, boolean isFullSleeve) {
        this.size = size;
        this.color = color;
        this.isFullSleeve = isFullSleeve;
    }

    @Override
    public String toString() {
        return
                "size='" + size + '\'' +
                        ", color='" + color + '\'' +
                        ", isFullSleeve=" + isFullSleeve;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 18;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Shirt) {
                Shirt shirt = this;
                Shirt shirt1 = (Shirt) obj;
                if (shirt.size.equals(shirt1.size) &&
                        shirt.color.equals(shirt1.color) &&
                        shirt.isFullSleeve == shirt1.isFullSleeve) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
