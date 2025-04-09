package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.GlassObject;

public class Mirror extends GlassObject {
    private String shape;
    private int height;
    private boolean isWallMounted;


    public Mirror(String shape, int height, boolean isWallMounted) {
        this.shape = shape;
        this.height = height;
        this.isWallMounted = isWallMounted;
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

    @Override
    public String toString() {
        return
                "shape='" + shape + '\'' +
                ", height=" + height +
                ", isWallMounted=" + isWallMounted ;
    }
}
