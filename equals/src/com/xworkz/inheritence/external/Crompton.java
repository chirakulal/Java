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
        return "productType='" + productType + '\'' +
                ", powerRating=" + powerRating +
                ", isEnergyEfficient=" + isEnergyEfficient;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 90;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Crompton) {
                Crompton other = (Crompton) obj;
                if (this.productType.equals(other.productType)) {
                    System.out.println("Both Crompton objects are same based on productType");
                    return true;
                }
            }
        }
        return false;
    }
}
