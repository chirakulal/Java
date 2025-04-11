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
        System.out.println("Parent :" + super.hashCode());
        return 26;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Sword) {
                Sword sword = this;
                Sword sword1 = (Sword) obj;
                if (sword.material.equals(sword1.material) &&
                        sword.length == sword1.length &&
                        sword.isSharp == sword1.isSharp) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
