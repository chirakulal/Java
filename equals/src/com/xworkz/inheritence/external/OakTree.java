package com.xworkz.inheritence.external;

public class OakTree {

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
        System.out.println("Parent :" + super.hashCode());
        return 29;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof OakTree) {
                OakTree oakTree = this;
                OakTree oakTree1 = (OakTree) obj;
                if (oakTree.age == oakTree1.age &&
                        oakTree.height == oakTree1.height &&
                        oakTree.hasAcorns == oakTree1.hasAcorns) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
