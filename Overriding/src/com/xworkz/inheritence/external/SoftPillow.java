package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Pillow;

public class SoftPillow extends Pillow {
    public SoftPillow() {
        super();
        System.out.println("No-arg constructor in SoftPillow");
    }
    @Override
    public void fluff() {
        System.out.println("Running fluff in SoftPillow");
    }
    @Override
    public void cover() {
        System.out.println("Running cover in SoftPillow");
    }
    @Override
    public void restOn() {
        System.out.println("Running restOn in SoftPillow");
    }
    @Override
    public void adjust() {
        System.out.println("Running adjust in SoftPillow");
    }
    @Override
    public void wash() {
        System.out.println("Running wash in SoftPillow");
    }
}
