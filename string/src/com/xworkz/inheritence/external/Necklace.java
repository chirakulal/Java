package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Jewel;

public class Necklace extends Jewel {
    private String material;
    private double length;
    private boolean hasPendant;


    public Necklace(String material, double length, boolean hasPendant) {
        this.material = material;
        this.length = length;
        this.hasPendant = hasPendant;
    }
    public void shine() {
        System.out.println("Running shine in Necklace");
    }

    public void wear() {
        System.out.println("Running wear in Necklace");
    }

    public void store() {
        System.out.println("Running store in Necklace");
    }

    public void polish() {
        System.out.println("Running polish in Necklace");
    }

    public void sell() {
        System.out.println("Running sell in Necklace");
    }

    public void order(){
        System.out.println("Running order in Necklace");
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", length=" + length +
                ", hasPendant=" + hasPendant ;
    }
}
