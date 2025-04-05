package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Tree;

public class OakTree extends Tree {

    public OakTree() {
        super();
        System.out.println("No-arg constructor is running in OakTree");
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

}
