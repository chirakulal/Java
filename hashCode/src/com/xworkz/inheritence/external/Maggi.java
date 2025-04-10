package com.xworkz.inheritence.external;

public class Maggi{
    private String flavor;
    private int cookingTime;
    private boolean isSpicy;


    public Maggi(String flavor, int cookingTime, boolean isSpicy) {
        this.flavor = flavor;
        this.cookingTime = cookingTime;
        this.isSpicy = isSpicy;
    }


    @Override
    public String toString() {
        return
                "flavor='" + flavor + '\'' +
                ", cookingTime=" + cookingTime +
                ", isSpicy=" + isSpicy ;
    }

    @Override
    public int hashCode() {
        return 75;
    }
}
