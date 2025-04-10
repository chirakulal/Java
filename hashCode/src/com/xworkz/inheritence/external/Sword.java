package com.xworkz.inheritence.external;


public class Sword {
    private String material;
    private int length;
    private boolean isSharp;


    public Sword(String material, int length, boolean isSharp) {
        this.material = material;
        this.length = length;
        this.isSharp = isSharp;
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", length=" + length +
                ", isSharp=" + isSharp;
    }

    @Override
    public int hashCode() {
        return 26;
    }
}
