package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Fish;

public class Shark extends Fish {
    private String species;
    private double length;
    private boolean isDangerous;


    public Shark(String species, double length, boolean isDangerous) {
        this.species = species;
        this.length = length;
        this.isDangerous = isDangerous;
    }
    @Override
    public void swim() {
        System.out.println("Running swim in Shark");
    }

    @Override
    public void breatheUnderwater() {
        System.out.println("Running breatheUnderwater in Shark");
    }

    @Override
    public void eatPlankton() {
        System.out.println("Running eatPlankton in Shark");
    }

    @Override
    public void layEggs() {
        System.out.println("Running layEggs in Shark");
    }

    @Override
    public void camouflage() {
        System.out.println("Running camouflage in Shark");
    }

    public void eatSmallFish(){
        System.out.println("Running eatsmallFish in Shark");
    }

    @Override
    public String toString() {
        return
                "species='" + species + '\'' +
                ", length=" + length +
                ", isDangerous=" + isDangerous ;
    }
}
