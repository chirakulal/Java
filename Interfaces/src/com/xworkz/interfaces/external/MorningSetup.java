package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Shampoo;
import com.xworkz.interfaces.internal.Toothbrush;

public class MorningSetup implements Toothbrush, Shampoo {

    @Override
    public void applyShampoo() {
        System.out.println("Running method in applyShampoo");
    }

    @Override
    public void rinseMouth() {
        System.out.println("Running method in applyShampoo");

    }

    @Override
    public void brushTeeth() {
        System.out.println("Running method in applyShampoo");

    }

    @Override
    public void applyToothpaste() {
        System.out.println("Running method in applyShampoo");

    }

    @Override
    public void dryHair() {
        System.out.println("Running method in applyShampoo");

    }

    @Override
    public void rinseShampoo() {
        System.out.println("Running method in applyShampoo");

    }
}
