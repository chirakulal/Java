package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Planet;

public class Earth extends Planet {
    public Earth() {
        super();
        System.out.println("No-arg constructor is running in Earth");
    }
    @Override
    public void rotate() {
        System.out.println("Running rotate in Earth");
    }

    @Override
    public void revolve() {
        System.out.println("Running revolve in Earth");
    }

    @Override
    public void supportLife() {
        System.out.println("Running supportLife in Earth");
    }

    @Override
    public void maintainGravity() {
        System.out.println("Running maintainGravity in Earth");
    }

    @Override

    public void experienceSeasons() {
        System.out.println("Running experienceSeasons in Earth");
    }

    public void waterbody(){
        System.out.println("Running waterbody in Earth");
    }

}
