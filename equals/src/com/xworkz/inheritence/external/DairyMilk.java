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
        return "flavor='" + flavor + '\'' +
                ", weight=" + weight +
                ", hasNuts=" + hasNuts;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 91;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof DairyMilk) {
                DairyMilk other = (DairyMilk) obj;
                if (this.flavor.equals(other.flavor)) {
                    System.out.println("Both DairyMilk objects are same based on flavor");
                    return true;
                }
            }
        }
        return false;
    }
}
