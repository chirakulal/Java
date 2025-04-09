package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Reptile;

public class Snake extends Reptile {
    private String species;
    private double length;
    private boolean isVenomous;


    public Snake(String species, double length, boolean isVenomous) {
        this.species = species;
        this.length = length;
        this.isVenomous = isVenomous;
    }
    @Override
    public void crawl() {
        System.out.println("Running crawl in Snake");
    }

    @Override
    public void shedSkin() {
        System.out.println("Running shedSkin in Snake");
    }

    @Override
    public void hunt() {
        System.out.println("Running hunt in Snake");
    }

    @Override
    public void hibernate() {
        System.out.println("Running hibernate in Snake");
    }

    @Override
    public void camouflage() {
        System.out.println("Running camouflage in Snake");
    }


    @Override
    public String toString() {
        return
                "species='" + species + '\'' +
                ", length=" + length +
                ", isVenomous=" + isVenomous;
    }
}
