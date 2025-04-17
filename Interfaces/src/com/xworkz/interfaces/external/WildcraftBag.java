package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Bag;

public class WildcraftBag implements Bag {
    @Override
    public void openBag() {
        System.out.println("Running openBag in WildcraftBag");
    }

    @Override
    public void closeBag() {
        System.out.println("Running closeBag in WildcraftBag");
    }

    @Override
    public void carryBag() {
        System.out.println("Running carryBag in WildcraftBag");
    }
}
