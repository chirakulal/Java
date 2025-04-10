package com.xworkz.inheritence.external;

public class Shoe  {

    private String brand;
    private int size;
    private boolean isSportsType;


    public Shoe(String brand, int size, boolean isSportsType) {
        this.brand = brand;
        this.size = size;
        this.isSportsType = isSportsType;
    }
    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", isSportsType=" + isSportsType;
    }

    @Override
    public int hashCode() {
        return 58;
    }
}
