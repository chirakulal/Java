package com.xworkz.inheritence.external;


public class Everest  {

    private double height;
    private String country;
    private boolean isClimbed;


    public Everest(double height, String country, boolean isClimbed) {
        this.height = height;
        this.country = country;
        this.isClimbed = isClimbed;
    }

    @Override
    public String toString() {
        return
                "height=" + height +
                ", country='" + country + '\'' +
                ", isClimbed=" + isClimbed ;
    }

    @Override
    public int hashCode() {
        return 43;
    }
}
