package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Pen;

public class Reynolds extends Pen {
    public Reynolds(){
        super();
        System.out.println("No-arg constructor running in Reynolds");
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
}
