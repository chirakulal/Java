package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Toothbrush;

public class OralB implements Toothbrush {

    @Override
    public void applyToothpaste() {
        System.out.println("Running applyToothpaste in OralB");
    }

    @Override
    public void brushTeeth() {
        System.out.println("Running brushTeeth in OralB");
    }

    @Override
    public void rinseMouth() {
        System.out.println("Running rinseMouth in OralB");
    }

    @Override
    public void flavour() {
        System.out.println("Running flavour in OralB");

    }
}
