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
                        ", isWhitening=" + isWhitening;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 76;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Colgate) {
                Colgate other = (Colgate) obj;
                if (this.variant.equals(other.variant)) {
                    System.out.println("Both Colgate objects are same based on variant");
                    return true;
                }
            }
        }
        return false;
    }
}
