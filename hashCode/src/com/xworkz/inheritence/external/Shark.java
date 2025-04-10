package com.xworkz.inheritence.external;


public class Shark  {
    private String species;
    private double length;
    private boolean isDangerous;


    public Shark(String species, double length, boolean isDangerous) {
        this.species = species;
        this.length = length;
        this.isDangerous = isDangerous;
    }

    @Override
    public String toString() {
        return
                "species='" + species + '\'' +
                ", length=" + length +
                ", isDangerous=" + isDangerous ;
    }

    @Override
    public int hashCode() {
        return 42;
    }
}
