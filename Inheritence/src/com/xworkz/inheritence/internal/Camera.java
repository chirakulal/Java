package com.xworkz.inheritence.internal;

public class Camera {

    public Camera() {
        System.out.println("No-arg constructor is running in Camera");
    }

    public void capturePhoto() {
        System.out.println("Capturing photo");
    }
    public void recordVideo() {
        System.out.println("Recording video");
    }
    public void adjustFocus() {
        System.out.println("Adjusting focus");
    }
    public void changeLens() {
        System.out.println("Changing camera lens");
    }
    public void viewGallery() {
        System.out.println("Viewing captured photos and videos");
    }
}
