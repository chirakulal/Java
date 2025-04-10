package com.xworkz.inheritence.external;


public class Earth {
    private double radius;
    private boolean hasLife;
    private int continentCount;


    public Earth(double radius, boolean hasLife, int continentCount) {
        this.radius = radius;
        this.hasLife = hasLife;
        this.continentCount = continentCount;
    }

    @Override
    public String toString() {
        return
                "radius=" + radius +
                ", hasLife=" + hasLife +
                ", continentCount=" + continentCount;
    }

    @Override
    public int hashCode() {
        return 37;
    }
}
