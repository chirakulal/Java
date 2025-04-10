package com.xworkz.inheritence.external;


public class Butterfly  {
    private String species;
    private String wingColor;
    private double wingspan;


    public Butterfly(String species, String wingColor, double wingspan) {
        this.species = species;
        this.wingColor = wingColor;
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return
                "species='" + species + '\'' +
                ", wingColor='" + wingColor + '\'' +
                ", wingspan=" + wingspan ;
    }

    @Override
    public int hashCode() {
        return 48;
    }
}
