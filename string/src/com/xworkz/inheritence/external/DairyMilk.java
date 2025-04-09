package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Chocolate;

public class DairyMilk extends Chocolate {

    private String flavor;
    private int weight;
    private boolean hasNuts;


    public DairyMilk(String flavor, int weight, boolean hasNuts) {
        this.flavor = flavor;
        this.weight = weight;
        this.hasNuts = hasNuts;
    }
    @Override
    public void unwrap() {
        System.out.println("Running unwrap in unwrap");
    }
    @Override
    public void bite() {
        System.out.println("Running bite in unwrap");
    }
    @Override
    public void share() {
        System.out.println("Running share in unwrap");
    }
    @Override
    public void melt() {
        System.out.println("Running melt in unwrap");
    }
    @Override
    public void chew() {
        System.out.println("Running chew in unwrap");
    }

    @Override
    public String toString() {
        return
                "flavor='" + flavor + '\'' +
                ", weight=" + weight +
                ", hasNuts=" + hasNuts ;
    }
}
