package com.xworkz.inheritence.external;

public class AloeVeraGel {

    private String brand;
    private int volume;
    private boolean isFragranceFree;

    public AloeVeraGel(String brand, int volume, boolean isFragranceFree) {
        this.brand = brand;
        this.volume = volume;
        this.isFragranceFree = isFragranceFree;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", volume=" + volume +
                        ", isFragranceFree=" + isFragranceFree;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 74;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof AloeVeraGel) {
                AloeVeraGel other = (AloeVeraGel) obj;
                if (this.brand.equals(other.brand)) {
                    System.out.println("Both AloeVeraGel objects are same based on brand");
                    return true;
                }
            }
        }
        return false;
    }
}
