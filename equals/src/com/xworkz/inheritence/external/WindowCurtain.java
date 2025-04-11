package com.xworkz.inheritence.external;

public class WindowCurtain  {
    private String fabricType;
    private int length;
    private boolean isBlackout;

    public WindowCurtain(String fabricType, int length, boolean isBlackout) {
        this.fabricType = fabricType;
        this.length = length;
        this.isBlackout = isBlackout;
    }

    @Override
    public String toString() {
        return "fabricType='" + fabricType + '\'' +
                ", length=" + length +
                ", isBlackout=" + isBlackout;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 95;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof WindowCurtain) {
                WindowCurtain other = (WindowCurtain) obj;
                if (this.fabricType.equals(other.fabricType)) {
                    System.out.println("Both WindowCurtain objects are same based on fabricType");
                    return true;
                }
            }
        }
        return false;
    }
}
