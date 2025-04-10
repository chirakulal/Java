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
        return
                "material='" + material + '\'' +
                ", toothCount=" + toothCount +
                ", isFoldable=" + isFoldable ;
    }

    @Override
    public int hashCode() {
        return 96;
    }
}
