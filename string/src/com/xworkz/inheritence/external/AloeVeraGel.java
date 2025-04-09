package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.SkincareProduct;

public class AloeVeraGel extends SkincareProduct {

    private String brand;
    private int volume;
    private boolean isFragranceFree;

    public AloeVeraGel(String brand, int volume, boolean isFragranceFree) {
        this.brand = brand;
        this.volume = volume;
        this.isFragranceFree = isFragranceFree;
    }
    @Override
    public void apply() {
        System.out.println("Running apply in AloeVeraGel");
    }

    @Override
    public void moisturize() {
        System.out.println("Running moisturize in AloeVeraGel");
    }

    @Override
    public void soothe() {
        System.out.println("Running soothe in AloeVeraGel");
    }

    @Override
    public void protect() {
        System.out.println("Running protect in AloeVeraGel");
    }

    @Override
    public void absorb() {
        System.out.println("Running absorb in AloeVeraGel");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                ", isFragranceFree=" + isFragranceFree ;
    }
}
