package com.xworkz.inheritence.external;

public class Maggi {
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
                        ", isSpicy=" + isSpicy;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 75;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Maggi) {
                Maggi other = (Maggi) obj;
                if (this.flavor.equals(other.flavor)) {
                    System.out.println("Both Maggi objects are same based on flavor");
                    return true;
                }
            }
        }
        return false;
    }
}
