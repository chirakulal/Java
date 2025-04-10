package com.xworkz.inheritence.external;


public class Snake  {
    private String species;
    private double length;
    private boolean isVenomous;


    public Snake(String species, double length, boolean isVenomous) {
        this.species = species;
        this.length = length;
        this.isVenomous = isVenomous;
    }

    @Override
    public String toString() {
        return
                "species='" + species + '\'' +
                ", length=" + length +
                ", isVenomous=" + isVenomous;
    }

    @Override
    public int hashCode() {
        return 44;
    }
}
