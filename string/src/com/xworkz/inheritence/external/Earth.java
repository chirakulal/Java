package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Planet;

public class Earth extends Planet {
    private double radius;
    private boolean hasLife;
    private int continentCount;


    public Earth(double radius, boolean hasLife, int continentCount) {
        this.radius = radius;
        this.hasLife = hasLife;
        this.continentCount = continentCount;
    }
    @Override
    public void rotate() {
        System.out.println("Running rotate in Earth");
    }

    @Override
    public void revolve() {
        System.out.println("Running revolve in Earth");
    }

    @Override
    public void supportLife() {
        System.out.println("Running supportLife in Earth");
    }

    @Override
    public void maintainGravity() {
        System.out.println("Running maintainGravity in Earth");
    }

    @Override

    public void experienceSeasons() {
        System.out.println("Running experienceSeasons in Earth");
    }

    public void waterbody(){
        System.out.println("Running waterbody in Earth");
    }

    @Override
    public String toString() {
        return
                "radius=" + radius +
                ", hasLife=" + hasLife +
                ", continentCount=" + continentCount;
    }
}
