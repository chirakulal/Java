package com.xworkz.inheritence.external;


public class Real {

    private String flavor;
    private int volume;
    private boolean hasAddedSugar;

    // Constructor
    public Real(String flavor, int volume, boolean hasAddedSugar) {
        this.flavor = flavor;
        this.volume = volume;
        this.hasAddedSugar = hasAddedSugar;
    }


    @Override
    public String toString() {
        return
                "flavor='" + flavor + '\'' +
                ", volume=" + volume +
                ", hasAddedSugar=" + hasAddedSugar;
    }

    @Override
    public int hashCode() {
        return 84;
    }
}
