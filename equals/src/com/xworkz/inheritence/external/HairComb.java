package com.xworkz.inheritence.external;

public class HairComb {
    private String material;
    private int toothCount;
    private boolean isFoldable;

    public HairComb(String material, int toothCount, boolean isFoldable) {
        this.material = material;
        this.toothCount = toothCount;
        this.isFoldable = isFoldable;
    }

    @Override
    public String toString() {
        return "material='" + material + '\'' +
                ", toothCount=" + toothCount +
                ", isFoldable=" + isFoldable;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 96;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof HairComb) {
                HairComb other = (HairComb) obj;
                if (this.material.equals(other.material)) {
                    System.out.println("Both HairComb objects are same based on material");
                    return true;
                }
            }
        }
        return false;
    }
}
