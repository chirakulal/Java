package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Fan;

public class Crompton extends Fan {
    private String productType;
    private int powerRating;
    private boolean isEnergyEfficient;


    public Crompton(String productType, int powerRating, boolean isEnergyEfficient) {
        this.productType = productType;
        this.powerRating = powerRating;
        this.isEnergyEfficient = isEnergyEfficient;
    }
    @Override
    public void rotate() {
        System.out.println("Running rotate in Crompton");
    }
    @Override
    public void changeSpeed() {
        System.out.println("Running changeSpeed in Crompton");
    }
    @Override
    public void swing() {
        System.out.println("Running swing in Crompton");
    }
    @Override
    public void stop() {
        System.out.println("Running stop in Crompton");
    }
    @Override
    public void cleanBlades() {
        System.out.println("Running cleanBlades in Crompton");
    }

    @Override
    public String toString() {
        return
                "productType='" + productType + '\'' +
                ", powerRating=" + powerRating +
                ", isEnergyEfficient=" + isEnergyEfficient;
    }
}
