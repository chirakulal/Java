package com.xworkz.inheritence.external;



public class Colgate {
    private String variant;
    private int netWeight;
    private boolean isWhitening;


    public Colgate(String variant, int netWeight, boolean isWhitening) {
        this.variant = variant;
        this.netWeight = netWeight;
        this.isWhitening = isWhitening;
    }

    @Override
    public String toString() {
        return
                "variant='" + variant + '\'' +
                ", netWeight=" + netWeight +
                ", isWhitening=" + isWhitening ;
    }

    @Override
    public int hashCode() {
        return 76;
    }
}
