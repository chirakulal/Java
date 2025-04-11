package com.xworkz.inheritence.external;

public class Guiter {

    private String brand;
    private int numberOfStrings;
    private boolean isElectric;

    public Guiter(String brand, int numberOfStrings, boolean isElectric) {
        this.brand = brand;
        this.numberOfStrings = numberOfStrings;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", numberOfStrings=" + numberOfStrings +
                        ", isElectric=" + isElectric;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 9;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Guiter) {
                Guiter g1 = this;
                Guiter g2 = (Guiter) obj;
                if (g1.brand.equals(g2.brand) &&
                        g1.numberOfStrings == g2.numberOfStrings &&
                        g1.isElectric == g2.isElectric) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
