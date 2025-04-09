package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Juice;

public class Real extends Juice {

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
    public void openCap() {
        System.out.println("Running openCap in Juice");
    }
    @Override
    public void pour()
    {
        System.out.println("Running pour in Juice");
    }
    @Override
    public void drink() {
        System.out.println("Running drink in Juice");
    }
    @Override
    public void refrigerate() {
        System.out.println("Running refrigerate in Juice");
    }
    @Override
    public void shakeWell() {
        System.out.println("Running shakeWell in Juice");
    }

    @Override
    public String toString() {
        return
                "flavor='" + flavor + '\'' +
                ", volume=" + volume +
                ", hasAddedSugar=" + hasAddedSugar;
    }
}
