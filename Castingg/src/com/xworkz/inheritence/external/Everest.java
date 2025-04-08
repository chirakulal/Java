package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Mountain;

public class Everest extends Mountain {

    public Everest() {
        super();
        System.out.println("No-arg constructor is running in Everest");
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

}
