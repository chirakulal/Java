package com.xworkz.inheritence.external;

public class Refrigerator {

    private String brand;
    private int capacity;
    private boolean hasFreezer;

    public Refrigerator(String brand, int capacity, boolean hasFreezer) {
        this.brand = brand;
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", capacity=" + capacity +
                        ", hasFreezer=" + hasFreezer;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 13;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Refrigerator) {
                Refrigerator r1 = this;
                Refrigerator r2 = (Refrigerator) obj;
                if (r1.brand.equals(r2.brand) &&
                        r1.capacity == r2.capacity &&
                        r1.hasFreezer == r2.hasFreezer) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
