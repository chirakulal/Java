package com.xworkz.inheritence.external;

public class CleanicPlus {

    private String productType;
    private int volume;
    private boolean isAlcoholBased;

    public CleanicPlus(String productType, int volume, boolean isAlcoholBased) {
        this.productType = productType;
        this.volume = volume;
        this.isAlcoholBased = isAlcoholBased;
    }

    @Override
    public String toString() {
        return
                "productType='" + productType + '\'' +
                        ", volume=" + volume +
                        ", isAlcoholBased=" + isAlcoholBased;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 55;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof CleanicPlus) {
                CleanicPlus cleanicPlus = (CleanicPlus) obj;
                if (this.productType.equals(cleanicPlus.productType)
                        && this.isAlcoholBased == cleanicPlus.isAlcoholBased) {
                    System.out.println("Both CleanicPlus objects are same based on productType and isAlcoholBased");
                    return true;
                }
            }
        }
        return false;
    }
}
