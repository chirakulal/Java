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
        System.out.println("Parent : " + super.hashCode());
        return 80;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Rin) {
                Rin other = (Rin) obj;
                if (this.productType.equals(other.productType)) {
                    System.out.println("Both Rin objects are same based on productType");
                    return true;
                }
            }
        }
        return false;
    }
}
