package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.InstantFood;

public class Maggi extends InstantFood {
    private String flavor;
    private int cookingTime;
    private boolean isSpicy;


    public Maggi(String flavor, int cookingTime, boolean isSpicy) {
        this.flavor = flavor;
        this.cookingTime = cookingTime;
        this.isSpicy = isSpicy;
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

    @Override
    public String toString() {
        return
                "flavor='" + flavor + '\'' +
                ", cookingTime=" + cookingTime +
                ", isSpicy=" + isSpicy ;
    }
}
