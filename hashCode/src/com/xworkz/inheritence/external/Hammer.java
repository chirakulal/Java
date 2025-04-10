package com.xworkz.inheritence.external;


public class Hammer {
    private String material;
    private double weight;
    private boolean isClawType;


    public Hammer(String material, double weight, boolean isClawType) {
        this.material = material;
        this.weight = weight;
        this.isClawType = isClawType;
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", weight=" + weight +
                ", isClawType=" + isClawType ;
    }

    @Override
    public int hashCode() {
        return 33;
    }
}
