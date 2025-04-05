package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.SkincareProduct;

public class AloeVeraGel extends SkincareProduct {

    public AloeVeraGel() {
        super();
        System.out.println("No-arg constructor is running in AloeVeraGel");
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

}
