package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Comb;

public class HairComb extends Comb {
    public HairComb() {
        super();
        System.out.println("No-arg constructor in HairComb");
    }
    @Override
    public void untangle() {
        System.out.println("Running untangle in HairComb");
    }
    @Override
    public void clean() {
        System.out.println("Running clean in HairComb");
    }
    @Override
    public void grip() {
        System.out.println("Running grip in HairComb");
    }
    @Override
    public void pack() {
        System.out.println("Running pack in HairComb");
    }
    @Override
    public void store() {
        System.out.println("Running store in HairComb");
    }
}
