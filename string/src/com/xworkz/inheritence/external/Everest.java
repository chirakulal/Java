package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Mountain;

public class Everest extends Mountain {

    private double height;
    private String country;
    private boolean isClimbed;


    public Everest(double height, String country, boolean isClimbed) {
        this.height = height;
        this.country = country;
        this.isClimbed = isClimbed;
    }
    @Override
    public void standTall() {
        System.out.println("Running standTall in Everest");
    }

    @Override
    public void provideResources() {
        System.out.println("Running provideResources in Everest");
    }

    @
    Override
    public void experienceWeatherChanges() {
        System.out.println("Running experienceWeatherChanges in Everest");
    }

    @Override
    public void supportEcosystem() {
        System.out.println("Running supportEcosystem in Everest");
    }

    @
    Override
    public void attractTourists() {
        System.out.println("Running attractTourists in Everest");
    }

    public void tall(){
        System.out.println("Running tall in Everest");
    }

    @Override
    public String toString() {
        return
                "height=" + height +
                ", country='" + country + '\'' +
                ", isClimbed=" + isClimbed ;
    }
}
