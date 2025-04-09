package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Curtain;

public class WindowCurtain extends Curtain {
    private String fabricType;
    private int length;
    private boolean isBlackout;


    public WindowCurtain(String fabricType, int length, boolean isBlackout) {
        this.fabricType = fabricType;
        this.length = length;
        this.isBlackout = isBlackout;
    }
    @Override
    public void drawOpen() {
        System.out.println("Running drawOpen in WindowCurtain");
    }
    @Override
    public void close() {
        System.out.println("Running close in WindowCurtain");
    }
    @Override
    public void wash() {
        System.out.println("Running wash in WindowCurtain");
    }
    @Override
    public void iron() {
        System.out.println("Running iron in WindowCurtain");
    }
    @Override
    public void hang() {
        System.out.println("Running hang in WindowCurtain");
    }

    @Override
    public String toString() {
        return
                "fabricType='" + fabricType + '\'' +
                ", length=" + length +
                ", isBlackout=" + isBlackout ;
    }
}
