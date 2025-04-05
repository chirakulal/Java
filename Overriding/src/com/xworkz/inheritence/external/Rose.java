package com.xworkz.inheritence.external;

public class Rose extends Flower{
    public Rose() {
        super();
        System.out.println("No-arg constructor is running in Rose");
    }
    @Override
    public void bloom() {
        System.out.println("Running bloom in Rose");
    }

    @Override
    public void releaseFragrance() {
        System.out.println("Running releaseFragrance in Rose");
    }

    @Override
    public void absorbSunlight() {
        System.out.println("Running absorbSunlight in Rose");
    }

    @Override
    public void attractBees() {
        System.out.println("Running attractBees in Rose");
    }

    @Override
    public void provideNectar() {
        System.out.println("Running provideNectar in Rose");
    }

}
