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
        return "productType='" + productType + '\'' +
                ", price=" + price +
                ", isEcoFriendly=" + isEcoFriendly;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 89;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Classmate) {
                Classmate other = (Classmate) obj;
                if (this.productType.equals(other.productType)) {
                    System.out.println("Both Classmate objects are same based on productType");
                    return true;
                }
            }
        }
        return false;
    }
}
