package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Tool;

public class Hammer extends Tool {
    private String material;
    private double weight;
    private boolean isClawType;


    public Hammer(String material, double weight, boolean isClawType) {
        this.material = material;
        this.weight = weight;
        this.isClawType = isClawType;
    }
    @Override
    public void use() {
        System.out.println("Running use in Hammer");
    }

    @Override
    public void repair() {
        System.out.println("Running repair in Hammer");
    }

    @Override
    public void maintain() {
        System.out.println("Running maintain in Hammer");
    }

    @Override
    public void storeSafely() {
        System.out.println("Running storeSafely in Hammer");
    }

    @Override

    public void checkDurability() {
        System.out.println("Running checkDurability in Hammer");
    }

    public void bendNail(){
        System.out.println("Running bendNail in Hammer");
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", weight=" + weight +
                ", isClawType=" + isClawType ;
    }
}
