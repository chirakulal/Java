package com.xworkz.inheritence.external;
;

public class OakTree  {

    private int age;
    private double height; // in meters
    private boolean hasAcorns;

    public OakTree(int age, double height, boolean hasAcorns) {
        this.age = age;
        this.height = height;
        this.hasAcorns = hasAcorns;
    }

    @Override
    public String toString() {
        return
                "age=" + age +
                ", height=" + height +
                ", hasAcorns=" + hasAcorns;
    }

    @Override
    public int hashCode() {
        return 29;
    }
}
