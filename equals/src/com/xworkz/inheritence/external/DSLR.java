package com.xworkz.inheritence.external;

public class DSLR {

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
        System.out.println("Parent :" + super.hashCode());
        return 32;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof DSLR) {
                DSLR dslr = this;
                DSLR dslr1 = (DSLR) obj;
                if (dslr.brand.equals(dslr1.brand) &&
                        dslr.megapixels == dslr1.megapixels &&
                        dslr.hasWiFi == dslr1.hasWiFi) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
