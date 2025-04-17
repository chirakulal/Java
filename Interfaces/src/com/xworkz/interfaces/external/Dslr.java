package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Camera;

public class Dslr implements Camera {

    @Override
    public void zoom() {
        System.out.println("Running zoom in Dslr");
    }

    @Override
    public void recordVideo() {
        System.out.println("Running recordVedio in Dslr");
    }

    @Override
    public void takePhoto() {
        System.out.println("Running takePhoto in Dslr");
    }

    @Override
    public void capture() {
        System.out.println("Running capture in Dslr");

    }
}
