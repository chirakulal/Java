package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Tree;

public class OakTree extends Tree {

    private int age;
    private double height; // in meters
    private boolean hasAcorns;

    public OakTree(int age, double height, boolean hasAcorns) {
        this.age = age;
        this.height = height;
        this.hasAcorns = hasAcorns;
    }
    @Override
    public void grow() {
        System.out.println("Running grow in  OakTree");
    }

    @Override
    public void shedLeaves() {
        System.out.println("Running shedLeaves in  OakTree");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Running photosynthesize in  OakTree");
    }

    @Override
    public void provideOxygen() {
        System.out.println("Running provideOxygen in  OakTree");
    }

    @Override
    public void bearFruit() {
        System.out.println("Running bearFruit in  OakTree");
    }

    public void pourWater(){
        System.out.println("Running pour water in oaktree");
    }

    @Override
    public String toString() {
        return
                "age=" + age +
                ", height=" + height +
                ", hasAcorns=" + hasAcorns;
    }
}
