package com.xworkz.inheritence.external;


public class Mango  {

    private String variety;
    private int weight;
    private boolean isRipe;


    public Mango(String variety, int weight, boolean isRipe) {
        this.variety = variety;
        this.weight = weight;
        this.isRipe = isRipe;
    }


    @Override
    public String toString() {
        return
                "variety='" + variety + '\'' +
                ", weight=" + weight +
                ", isRipe=" + isRipe ;
    }

    @Override
    public int hashCode() {
        return 60;
    }
}
