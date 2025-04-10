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
        return
                "productType='" + productType + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", warrantyYears=" + warrantyYears ;
    }

    @Override
    public int hashCode() {
        return 87;
    }
}
