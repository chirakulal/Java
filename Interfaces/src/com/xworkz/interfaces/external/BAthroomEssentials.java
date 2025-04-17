package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Shampoo;
import com.xworkz.interfaces.internal.Soap;

public class BAthroomEssentials implements Soap, Shampoo {

    @Override
    public void applyShampoo() {
        System.out.println("Runnning method in applyShampoo");
    }

    @Override
    public void applySoap() {
        System.out.println("Runnning method in applyShampoo");

    }

    @Override
    public void dryHair() {
        System.out.println("Runnning method in applyShampoo");

    }

    @Override
    public void rinseShampoo() {
        System.out.println("Runnning method in applyShampoo");

    }

    @Override
    public void rinseSoap() {
        System.out.println("Runnning method in applyShampoo");

    }

    @Override
    public void drySkin() {
        System.out.println("Runnning method in applyShampoo");

    }
}
