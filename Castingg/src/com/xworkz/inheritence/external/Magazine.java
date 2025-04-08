package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Newspaper;

public class Magazine extends Newspaper {

    public Magazine() {
        super();
        System.out.println("No-arg constructor is running in Magazine");
    }
    @
    Override
    public void printNews() {
        System.out.println("Running printNews in Magazine");
    }

    @Override
    public void distribute() {
        System.out.println("Running distribute in Magazine");
    }

    @Override
    public void advertise() {
        System.out.println("Running advertise in Magazine");
    }

    @Override
    public void updateDaily() {
        System.out.println("Running updateDaily in Magazine");
    }

    @Override
    public void provideInformation() {
        System.out.println("Running provideInformation in Magazine");
    }

    public void read(){
        System.out.println("Running read in Magazine");
    }

}
