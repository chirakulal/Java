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
                ", hasPendant=" + hasPendant ;
    }

    @Override
    public int hashCode() {
        return 49;
    }
}
