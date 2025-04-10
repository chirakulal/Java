package com.xworkz.inheritence.external;


public class CleanicPlus  {

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
        return 55;
    }
}
