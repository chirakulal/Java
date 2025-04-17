package com.xworkz.interfaces.internal;

public interface Camera {

    void takePhoto();
    void recordVideo();
    void zoom();

    default void capture(){
        System.out.println("Running capture in Camera");
    }
}
