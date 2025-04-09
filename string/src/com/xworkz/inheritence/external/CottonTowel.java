package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Towel;

public class CottonTowel extends Towel {
    private String color;
    private String size;
    private int absorbencyLevel;


    public CottonTowel(String color, String size, int absorbencyLevel) {
        this.color = color;
        this.size = size;
        this.absorbencyLevel = absorbencyLevel;
    }

    @Override
    public void absorb() {
        System.out.println("Running absorb in CottonTowel");
    }
    @Override
    public void dry() {
        System.out.println("Running dry in CottonTowel");
    }
    @Override
    public void wash() {
        System.out.println("Running wash in CottonTowel");
    }
    @Override
    public void fold() {
        System.out.println("Running fold in CottonTowel");
    }
    @Override
    public void hang() {
        System.out.println("Running hang in CottonTowel");
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", absorbencyLevel=" + absorbencyLevel;
    }
}
