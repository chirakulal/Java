package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Pen;

public class Reynolds extends Pen {
    private String penType;
    private String inkColor;
    private boolean isRefillable;


    public Reynolds(String penType, String inkColor, boolean isRefillable) {
        this.penType = penType;
        this.inkColor = inkColor;
        this.isRefillable = isRefillable;
    }
    @Override
    public void write() {
        System.out.println("Running write in Reynolds");
    }
    @Override
    public void refill() {
        System.out.println("Running refill in Reynolds");
    }
    @Override
    public void cap() {
        System.out.println("Running cap in Reynolds");
    }
    @Override
    public void uncap() {
        System.out.println("Running uncap in Reynolds");
    }
    @Override
    public void inkFlow() {
        System.out.println("Running inkFlow in Reynolds");
    }

    @Override
    public String toString() {
        return
                "penType='" + penType + '\'' +
                ", inkColor='" + inkColor + '\'' +
                ", isRefillable=" + isRefillable ;
    }
}
