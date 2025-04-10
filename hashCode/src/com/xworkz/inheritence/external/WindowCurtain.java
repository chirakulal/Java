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
        return
                "fabricType='" + fabricType + '\'' +
                ", length=" + length +
                ", isBlackout=" + isBlackout ;
    }

    @Override
    public int hashCode() {
        return 95;
    }
}
