package com.xworkz.inheritence.external;

public class Butterfly {
    private String species;
    private String wingColor;
    private double wingspan;

    public Butterfly(String species, String wingColor, double wingspan) {
        this.species = species;
        this.wingColor = wingColor;
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return
                "species='" + species + '\'' +
                        ", wingColor='" + wingColor + '\'' +
                        ", wingspan=" + wingspan;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 48;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Butterfly) {
                Butterfly butterfly = (Butterfly) obj;
                if (this.species.equals(butterfly.species) &&
                        this.wingColor.equals(butterfly.wingColor)) {
                    System.out.println("Both butterflies are same based on species and wingColor");
                    return true;
                }
            }
        }
        return false;
    }
}
