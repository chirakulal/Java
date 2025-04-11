package com.xworkz.inheritence.external;

public class CottonTowel {
    private String color;
    private String size;
    private int absorbencyLevel;

    public CottonTowel(String color, String size, int absorbencyLevel) {
        this.color = color;
        this.size = size;
        this.absorbencyLevel = absorbencyLevel;
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", absorbencyLevel=" + absorbencyLevel;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 86;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof CottonTowel) {
                CottonTowel other = (CottonTowel) obj;
                if (this.color.equals(other.color)) {
                    System.out.println("Both CottonTowel objects are same based on color");
                    return true;
                }
            }
        }
        return false;
    }
}
