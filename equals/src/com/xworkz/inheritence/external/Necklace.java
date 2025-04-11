package com.xworkz.inheritence.external;

public class Necklace {
    private String material;
    private double length;
    private boolean hasPendant;

    public Necklace(String material, double length, boolean hasPendant) {
        this.material = material;
        this.length = length;
        this.hasPendant = hasPendant;
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                        ", length=" + length +
                        ", hasPendant=" + hasPendant;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 49;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Necklace) {
                Necklace necklace = (Necklace) obj;
                if (this.material.equals(necklace.material) &&
                        this.length == necklace.length) {
                    System.out.println("Both necklaces are same based on material and length");
                    return true;
                }
            }
        }
        return false;
    }
}
