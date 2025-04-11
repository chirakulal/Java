package com.xworkz.inheritence.external;

public class Mango {

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
                        ", isRipe=" + isRipe;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 60;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Mango) {
                Mango mango = (Mango) obj;
                if (this.variety.equals(mango.variety)
                        && this.weight == mango.weight) {
                    System.out.println("Both Mango objects are same based on variety and weight");
                    return true;
                }
            }
        }
        return false;
    }
}
