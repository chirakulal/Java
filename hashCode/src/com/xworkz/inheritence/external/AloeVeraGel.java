package com.xworkz.inheritence.external;


public class AloeVeraGel  {

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
                ", isFragranceFree=" + isFragranceFree ;
    }

    @Override
    public int hashCode() {
        return 74;
    }
}
