package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Dishware;

public class Plate extends Dishware {

    public Plate() {
        super();
        System.out.println("No-arg constructor is running in Plate");
    }
    @Override
    public void serveFood() {
        System.out.println("Running serveFood in Plate");
    }

    @Override
    public void clean() {
        System.out.println("Running clean in Plate");
    }

    @Override
    public void stack() {
        System.out.println("Running stack in Plate");
    }

    @Override
    public void store() {
        System.out.println("Running store in Plate");
    }

    @Override
    public void breakIfDropped() {
        System.out.println("Running breakIfDropped in Plate");
    }

}
