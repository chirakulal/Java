package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.GlassObject;

public class Mirror extends GlassObject {
    public Mirror() {
        super();
        System.out.println("No-arg constructor is running in Mirror");
    }
    @Override
    public void reflect() {
        System.out.println("Running reflect in Mirror");
    }

    @Override
    public void clean() {
        System.out.println("Running clean in Mirror");
    }

    @Override
    public void breakGlass() {
        System.out.println("Running breakGlass in Mirror");
    }

    @Override
    public void mount() {
        System.out.println("Running mount in Mirror");
    }

    @Override
    public void frame() {
        System.out.println("Running frame in Mirror");
    }

}
