package com.xworkz.inheritence.external;

public class Laptop  {

    private String brand;
    private int ramSize;
    private boolean hasTouchscreen;

    public Laptop(String brand, int ramSize, boolean hasTouchscreen) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.hasTouchscreen = hasTouchscreen;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", ramSize=" + ramSize +
                        ", hasTouchscreen=" + hasTouchscreen;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 31;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Laptop) {
                Laptop laptop = this;
                Laptop laptop1 = (Laptop) obj;
                if (laptop.brand.equals(laptop1.brand) &&
                        laptop.ramSize == laptop1.ramSize &&
                        laptop.hasTouchscreen == laptop1.hasTouchscreen) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
