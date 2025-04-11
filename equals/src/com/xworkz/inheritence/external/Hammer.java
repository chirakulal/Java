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
                        ", isClawType=" + isClawType;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 33;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Hammer) {
                Hammer hammer = this;
                Hammer hammer1 = (Hammer) obj;
                if (hammer.material.equals(hammer1.material)
                        && hammer.weight == hammer1.weight
                        && hammer.isClawType == hammer1.isClawType) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
