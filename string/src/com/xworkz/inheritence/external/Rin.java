package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Soap;

public class Rin extends Soap {
    private String productType;
    private int weight;
    private boolean isForWhites;


    public Rin(String productType, int weight, boolean isForWhites) {
        this.productType = productType;
        this.weight = weight;
        this.isForWhites = isForWhites;
    }
    @Override
    public void foam() {
        System.out.println("Running foam in Rin");
    }
    @Override
    public void washClothes() {
        System.out.println("Running washClothes in Rin");
    }
    @Override
    public void smellFresh() {
        System.out.println("Running smellFresh in Rin");
    }
    @Override
    public void removeStains() {
        System.out.println("Running removeStains in Rin");
    }
    @Override
    public void rinse() {
        System.out.println("Running rinse in Rin");
    }


    @Override
    public String toString() {
        return
                "productType='" + productType + '\'' +
                ", weight=" + weight +
                ", isForWhites=" + isForWhites;
    }
}
