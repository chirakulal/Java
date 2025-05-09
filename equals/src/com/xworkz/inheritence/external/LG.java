package com.xworkz.inheritence.external;

public class LG {
    private String productType;
    private String modelNumber;
    private int warrantyYears;

    public LG(String productType, String modelNumber, int warrantyYears) {
        this.productType = productType;
        this.modelNumber = modelNumber;
        this.warrantyYears = warrantyYears;
    }

    @Override
    public String toString() {
        return "productType='" + productType + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", warrantyYears=" + warrantyYears;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 87;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof LG) {
                LG other = (LG) obj;
                if (this.productType.equals(other.productType)) {
                    System.out.println("Both LG objects are same based on productType");
                    return true;
                }
            }
        }
        return false;
    }
}
