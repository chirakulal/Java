package com.xworkz.inheritence.external;

public class Mirror {

    private String shape;
    private int height;
    private boolean isWallMounted;

    public Mirror(String shape, int height, boolean isWallMounted) {
        this.shape = shape;
        this.height = height;
        this.isWallMounted = isWallMounted;
    }

    @Override
    public String toString() {
        return
                "shape='" + shape + '\'' +
                        ", height=" + height +
                        ", isWallMounted=" + isWallMounted;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 67;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Mirror) {
                Mirror mirror = (Mirror) obj;
                if (this.shape.equals(mirror.shape) &&
                        this.height == mirror.height) {
                    System.out.println("Both Mirror objects are same based on shape and height");
                    return true;
                }
            }
        }
        return false;
    }
}
