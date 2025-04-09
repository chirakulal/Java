package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.ShowerGel;

public class Pears extends ShowerGel {
    private String variety;
    private int weight;
    private boolean isOrganic;


    public Pears(String variety, int weight, boolean isOrganic) {
        this.variety = variety;
        this.weight = weight;
        this.isOrganic = isOrganic;
    }
    @Override
    public void cleanse() {
        System.out.println("Running cleanse in Pears");
    }

    @Override
    public void moisturize() {
        System.out.println("Running moisturize in Pears");
    }

    @
    Override
    public void foam() {
        System.out.println("Running foam in Pears");
    }

    @
    Override
    public void fragrance() {
        System.out.println("Running fragrance in Pears");
    }

    @Override
    public void rinseOff() {
        System.out.println("Running rinseOff in Pears");
    }

    @Override
    public String toString() {
        return
                "variety='" + variety + '\'' +
                ", weight=" + weight +
                ", isOrganic=" + isOrganic ;
    }
}
