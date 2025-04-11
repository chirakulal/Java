package com.xworkz.inheritence.external;

public class Shark {
    private String species;
    private double length;
    private boolean isDangerous;

    public Shark(String species, double length, boolean isDangerous) {
        this.species = species;
        this.length = length;
        this.isDangerous = isDangerous;
    }

    @Override
    public String toString() {
        return
                "species='" + species + '\'' +
                        ", length=" + length +
                        ", isDangerous=" + isDangerous;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 42;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Shark) {
                Shark shark1 = this;
                Shark shark2 = (Shark) obj;
                if (shark1.species.equals(shark2.species) && shark1.isDangerous == shark2.isDangerous) {
                    System.out.println("Both are same based on species and danger status");
                    return true;
                }
            }
        }
        return false;
    }
}
