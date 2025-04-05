package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.FabricSoftener;

public class Comfort extends FabricSoftener {
    public Comfort() {
        super();
        System.out.println("No-arg constructor is running in Comfort");
    }
    @Override
    public void softenClothes() {
        System.out.println("Running softenClothes in Comfort");
    }

    @Override
    public void addFragrance() {
        System.out.println("Running addFragrance in Comfort");
    }

    @Override
    public void reduceWrinkles() {
        System.out.println("Running reduceWrinkles in Comfort");
    }

    @Override
    public void preventStatic() {
        System.out.println("Running preventStatic in Comfort");
    }

    @Override
    public void enhanceFreshness() {
        System.out.println("Running enhanceFreshness in Comfort");
    }

}
