package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Comb;

public class HairComb extends Comb {
    private String material;
    private int toothCount;
    private boolean isFoldable;


    public HairComb(String material, int toothCount, boolean isFoldable) {
        this.material = material;
        this.toothCount = toothCount;
        this.isFoldable = isFoldable;
    }
    @Override
    public void untangle() {
        System.out.println("Running untangle in HairComb");
    }
    @Override
    public void clean() {
        System.out.println("Running clean in HairComb");
    }
    @Override
    public void grip() {
        System.out.println("Running grip in HairComb");
    }
    @Override
    public void pack() {
        System.out.println("Running pack in HairComb");
    }
    @Override
    public void store() {
        System.out.println("Running store in HairComb");


    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", toothCount=" + toothCount +
                ", isFoldable=" + isFoldable ;
    }
}
