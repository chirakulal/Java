package com.xworkz.inheritence.external;

public class Real {

    private String flavor;
    private int volume;
    private boolean hasAddedSugar;

    // Constructor
    public Real(String flavor, int volume, boolean hasAddedSugar) {
        this.flavor = flavor;
        this.volume = volume;
        this.hasAddedSugar = hasAddedSugar;
    }

    @Override
    public String toString() {
        return "flavor='" + flavor + '\'' +
                ", volume=" + volume +
                ", hasAddedSugar=" + hasAddedSugar;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 84;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Real) {
                Real other = (Real) obj;
                if (this.flavor.equals(other.flavor)) {
                    System.out.println("Both Real objects are same based on flavor");
                    return true;
                }
            }
        }
        return false;
    }
}
