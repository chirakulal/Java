package com.xworkz.inheritence.external;

public class Crompton {
    private String productType;
    private int powerRating;
    private boolean isEnergyEfficient;


    public Crompton(String productType, int powerRating, boolean isEnergyEfficient) {
        this.productType = productType;
        this.powerRating = powerRating;
        this.isEnergyEfficient = isEnergyEfficient;
    }


    @Override
    public String toString() {
        return
                "productType='" + productType + '\'' +
                ", powerRating=" + powerRating +
                ", isEnergyEfficient=" + isEnergyEfficient;
    }

    @Override
    public int hashCode() {
        return 90;
    }
}
