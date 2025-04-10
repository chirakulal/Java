package com.xworkz.inheritence.external;


public class Plate  {

    private String material;
    private int diameter;
    private boolean isMicrowaveSafe;


    public Plate(String material, int diameter, boolean isMicrowaveSafe) {
        this.material = material;
        this.diameter = diameter;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", diameter=" + diameter +
                ", isMicrowaveSafe=" + isMicrowaveSafe ;
    }

    @Override
    public int hashCode() {
        return 69;
    }
}
