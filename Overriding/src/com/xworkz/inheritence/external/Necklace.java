package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Jewel;

public class Necklace extends Jewel {
    public Necklace() {
        super();
        System.out.println("No-arg constructor is running in Necklace");
    }
    public void shine() {
        System.out.println("Running shine in Necklace");
    }

    public void wear() {
        System.out.println("Running wear in Necklace");
    }

    public void store() {
        System.out.println("Running store in Necklace");
    }

    public void polish() {
        System.out.println("Running polish in Necklace");
    }

    public void sell() {
        System.out.println("Running sell in Necklace");
    }

}
