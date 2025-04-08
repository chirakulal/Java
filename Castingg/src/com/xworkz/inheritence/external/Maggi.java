package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.InstantFood;

public class Maggi extends InstantFood {
    public Maggi() {
        super();
        System.out.println("No-arg constructor in Maggi");
    }

    @Override
    public void openPack() {
        System.out.println("Running openPack in Maggi");
    }

    @Override
    public void addWater() {
        System.out.println("Running addWater in Maggi");
    }

    @Override
    public void boil() {
        System.out.println("Running boil in Maggi");
    }

    @Override
    public void stir() {
        System.out.println("Running stir in Maggi");
    }

    @Override
    public void serve() {
        System.out.println("Running serve in Maggi");
    }

}
