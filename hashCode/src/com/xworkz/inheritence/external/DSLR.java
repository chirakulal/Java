package com.xworkz.inheritence.external;

public class DSLR  {

    private String brand;
    private int megapixels;
    private boolean hasWiFi;


    public DSLR(String brand, int megapixels, boolean hasWiFi) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.hasWiFi = hasWiFi;
    }



    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", megapixels=" + megapixels +
                ", hasWiFi=" + hasWiFi;
    }

    @Override
    public int hashCode() {
        return 32;
    }
}
