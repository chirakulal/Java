package com.xworkz.inheritence.external;


public class Rin {
    private String productType;
    private int weight;
    private boolean isForWhites;


    public Rin(String productType, int weight, boolean isForWhites) {
        this.productType = productType;
        this.weight = weight;
        this.isForWhites = isForWhites;
    }


    @Override
    public String toString() {
        return
                "productType='" + productType + '\'' +
                ", weight=" + weight +
                ", isForWhites=" + isForWhites;
    }

    @Override
    public int hashCode() {
        return 80;
    }
}
