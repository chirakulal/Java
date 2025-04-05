package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Fish;

public class Shark extends Fish {
    public Shark() {
        super();
        System.out.println("No-arg constructor is running in Shark");
    }
    @Override
    public void swim() {
        System.out.println("Running swim in Shark");
    }

    @Override
    public void breatheUnderwater() {
        System.out.println("Running breatheUnderwater in Shark");
    }

    @Override
    public void eatPlankton() {
        System.out.println("Running eatPlankton in Shark");
    }

    @Override
    public void layEggs() {
        System.out.println("Running layEggs in Shark");
    }

    @Override
    public void camouflage() {
        System.out.println("Running camouflage in Shark");
    }

}
