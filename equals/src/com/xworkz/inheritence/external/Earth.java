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
        System.out.println("Parent :" + super.hashCode());
        return 37;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Earth) {
                Earth earth = this;
                Earth earth1 = (Earth) obj;
                if (earth.radius == earth1.radius &&
                        earth.hasLife == earth1.hasLife &&
                        earth.continentCount == earth1.continentCount) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
