package com.xworkz.inheritence.external;

public class Chair {
    private String material;
    private String color;
    private boolean hasArmrest;

    public Chair(String material, String color, boolean hasArmrest) {
        this.material = material;
        this.color = color;
        this.hasArmrest = hasArmrest;
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                        ", color='" + color + '\'' +
                        ", hasArmrest=" + hasArmrest;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 15;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Chair) {
                Chair c1 = this;
                Chair c2 = (Chair) obj;
                if (c1.material.equals(c2.material) &&
                        c1.color.equals(c2.color) &&
                        c1.hasArmrest == c2.hasArmrest) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
