package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Fan;

public class Crompton extends Fan {
    public Crompton() {
        super();
        System.out.println("No-arg constructor in Crompton");
    }
    @Override
    public void rotate() {
        System.out.println("Running rotate in Crompton");
    }
    @Override
    public void changeSpeed() {
        System.out.println("Running changeSpeed in Crompton");
    }
    @Override
    public void swing() {
        System.out.println("Running swing in Crompton");
    }
    @Override
    public void stop() {
        System.out.println("Running stop in Crompton");
    }
    @Override
    public void cleanBlades() {
        System.out.println("Running cleanBlades in Crompton");
    }
}
