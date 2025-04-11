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
                        ", isOrganic=" + isOrganic;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 68;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Pears) {
                Pears pears = (Pears) obj;
                if (this.variety.equals(pears.variety) &&
                        this.weight == pears.weight) {
                    System.out.println("Both Pears objects are same based on variety and weight");
                    return true;
                }
            }
        }
        return false;
    }
}
