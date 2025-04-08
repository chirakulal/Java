package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Sunscreen;

public class Deconstruct extends Sunscreen {

    public Deconstruct() {
        super();
        System.out.println("No-arg constructor is running in Deconstruct");
    }
    @Override
    public void protectFromUV() {
        System.out.println("Running protectFromUV in Deconstruct");
    }

    @Override
    public void absorb() {
        System.out.println("Running absorb in Deconstruct");
    }

    @Override
    public void preventBurns() {
        System.out.println("Running preventBurns in Deconstruct");
    }

    @Override
    public void hydrate() {
        System.out.println("Running hydrate in Deconstruct");
    }

    @Override
    public void provideSPF() {
        System.out.println("Running provideSPF in Deconstruct");
    }

}
