package com.xworkz.inheritence.external;


public class DairyMilk {

    private String flavor;
    private int weight;
    private boolean hasNuts;


    public DairyMilk(String flavor, int weight, boolean hasNuts) {
        this.flavor = flavor;
        this.weight = weight;
        this.hasNuts = hasNuts;
    }


    @Override
    public String toString() {
        return
                "flavor='" + flavor + '\'' +
                ", weight=" + weight +
                ", hasNuts=" + hasNuts ;
    }

    @Override
    public int hashCode() {
        return 91;
    }
}
