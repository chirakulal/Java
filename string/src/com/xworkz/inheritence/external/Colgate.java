package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Toothpaste;

public class Colgate extends Toothpaste {
    private String variant;
    private int netWeight;
    private boolean isWhitening;


    public Colgate(String variant, int netWeight, boolean isWhitening) {
        this.variant = variant;
        this.netWeight = netWeight;
        this.isWhitening = isWhitening;
    }
    @Override
    public void cleanTeeth(){
        System.out.println("Running cleanTeeth in Colgate");
    }
    @Override
    public void freshenBreath() {
        System.out.println("Running FreshenBreadth in Colgate");
    }
    @Override
    public void protectGums() {
        System.out.println("Running protectGums in Colgate");
    }
    @Override
    public void removePlaque() {
        System.out.println("Running removePlaque in Colgate");
    }
    @Override
    public void whitenTeeth() {
        System.out.println("Running whitenTeeth in Colgate");
    }

    @Override
    public String toString() {
        return
                "variant='" + variant + '\'' +
                ", netWeight=" + netWeight +
                ", isWhitening=" + isWhitening ;
    }
}
