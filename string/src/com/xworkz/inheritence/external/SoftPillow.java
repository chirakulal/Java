package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Pillow;

public class SoftPillow extends Pillow {
    private String material;
    private String size;
    private boolean isWashable;


    public SoftPillow(String material, String size, boolean isWashable) {
        this.material = material;
        this.size = size;
        this.isWashable = isWashable;
    }
    @Override
    public void fluff() {
        System.out.println("Running fluff in SoftPillow");
    }
    @Override
    public void cover() {
        System.out.println("Running cover in SoftPillow");
    }
    @Override
    public void restOn() {
        System.out.println("Running restOn in SoftPillow");
    }
    @Override
    public void adjust() {
        System.out.println("Running adjust in SoftPillow");
    }
    @Override
    public void wash() {
        System.out.println("Running wash in SoftPillow");
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", isWashable=" + isWashable;
    }
}
