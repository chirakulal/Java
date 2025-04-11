package com.xworkz.inheritence.external;

public class Snake  {
    private String species;
    private double length;
    private boolean isVenomous;

    public Snake(String species, double length, boolean isVenomous) {
        this.species = species;
        this.length = length;
        this.isVenomous = isVenomous;
    }

    @Override
    public String toString() {
        return
                "species='" + species + '\'' +
                        ", length=" + length +
                        ", isVenomous=" + isVenomous;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 44;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Snake) {
                Snake snake1 = this;
                Snake snake2 = (Snake) obj;
                if (snake1.length == snake2.length && snake1.isVenomous == snake2.isVenomous) {
                    System.out.println("Both are same based on length and isVenomous");
                    return true;
                }
            }
        }
        return false;
    }
}
