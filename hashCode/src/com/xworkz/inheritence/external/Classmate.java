package com.xworkz.inheritence.external;


public class Classmate {
    private String productType;
    private double price;
    private boolean isEcoFriendly;


    public Classmate(String productType, double price, boolean isEcoFriendly) {
        this.productType = productType;
        this.price = price;
        this.isEcoFriendly = isEcoFriendly;
    }


    @Override
    public String toString() {
        return
                "productType='" + productType + '\'' +
                ", price=" + price +
                ", isEcoFriendly=" + isEcoFriendly ;
    }

    @Override
    public int hashCode() {
        return 89;
    }
}
