package com.xworkz.inheritence.external;

public class FootBall {
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
                        ", isOfficial=" + isOfficial;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 35;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof FootBall) {
                FootBall footBall = this;
                FootBall footBall1 = (FootBall) obj;
                if (footBall.brand.equals(footBall1.brand)
                        && footBall.size == footBall1.size
                        && footBall.isOfficial == footBall1.isOfficial) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
