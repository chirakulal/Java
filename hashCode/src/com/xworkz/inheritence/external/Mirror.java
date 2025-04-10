package com.xworkz.inheritence.external;

public class Mirror  {
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
                ", isWallMounted=" + isWallMounted ;
    }

    @Override
    public int hashCode() {
        return 67;
    }
}
