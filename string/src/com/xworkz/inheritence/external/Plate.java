package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Dishware;

public class Plate extends Dishware {

    private String material;
    private int diameter;
    private boolean isMicrowaveSafe;


    public Plate(String material, int diameter, boolean isMicrowaveSafe) {
        this.material = material;
        this.diameter = diameter;
        this.isMicrowaveSafe = isMicrowaveSafe;
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

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", diameter=" + diameter +
                ", isMicrowaveSafe=" + isMicrowaveSafe ;
    }
}
