package com.xworkz.inheritence.external;


public class FootBall  {
    private String brand;
    private int size;
    private boolean isOfficial;


    public FootBall(String brand, int size, boolean isOfficial) {
        this.brand = brand;
        this.size = size;
        this.isOfficial = isOfficial;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", isOfficial=" + isOfficial ;
    }

    @Override
    public int hashCode() {
        return 35;
    }
}
