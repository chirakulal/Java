package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.ShowerGel;

public class Pears extends ShowerGel {
    public Pears() {
        super();
        System.out.println("No-arg constructor is running in Pears");
    }
    @Override
    public void cleanse() {
        System.out.println("Running cleanse in Pears");
    }

    @Override
    public void moisturize() {
        System.out.println("Running moisturize in Pears");
    }

    @
    Override
    public void foam() {
        System.out.println("Running foam in Pears");
    }

    @
    Override
    public void fragrance() {
        System.out.println("Running fragrance in Pears");
    }

    @Override
    public void rinseOff() {
        System.out.println("Running rinseOff in Pears");
    }

}
