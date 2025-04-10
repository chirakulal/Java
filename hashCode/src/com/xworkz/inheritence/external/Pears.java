package com.xworkz.inheritence.external;

public class Pears {
    private String variety;
    private int weight;
    private boolean isOrganic;


    public Pears(String variety, int weight, boolean isOrganic) {
        this.variety = variety;
        this.weight = weight;
        this.isOrganic = isOrganic;
    }

    @Override
    public String toString() {
        return
                "variety='" + variety + '\'' +
                ", weight=" + weight +
                ", isOrganic=" + isOrganic ;
    }

    @Override
    public int hashCode() {
        return 68;
    }
}
