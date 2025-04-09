package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Furniture;

public class Chair extends Furniture {
    private String material;
    private String color;
    private boolean hasArmrest;

    public Chair(String material, String color, boolean hasArmrest) {
        this.material = material;
        this.color = color;
        this.hasArmrest = hasArmrest;
    }
    @Override
    public void sit(){
        System.out.println("Running sit in Chair");
    }
    @Override
    public void sleep(){
        System.out.println("Running sleep in Chair");
    }
    @Override
    public void showcase(){
        System.out.println("Running showcase in Chair");
    }
    @Override
    public void tostore(){
        System.out.println("Running tostore in Chair");
    }
    @Override
    public void design(){
        System.out.println("Running design in Chair");
    }
    public void buy(){
        System.out.println("Running buy in Chair");
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", hasArmrest=" + hasArmrest;
    }
}
