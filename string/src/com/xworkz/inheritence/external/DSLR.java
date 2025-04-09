package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Camera;

public class DSLR extends Camera {

    private String brand;
    private int megapixels;
    private boolean hasWiFi;


    public DSLR(String brand, int megapixels, boolean hasWiFi) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.hasWiFi = hasWiFi;
    }
    @Override
    public void capturePhoto() {
        System.out.println("Running capturePhoto in DSLR");
    }

    @Override
    public void recordVideo() {
        System.out.println("Running recordVideo in DSLR");
    }

    @Override
    public void adjustFocus() {
        System.out.println("Running adjustFocus in DSLR");
    }

    @Override
    public void changeLens() {
        System.out.println("Running changeLens in DSLR");
    }

    @Override
    public void viewGallery() {
        System.out.println("Running viewGallery in DSLR");
    }

    public void delete(){
        System.out.println("Running delete in DSLR");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", megapixels=" + megapixels +
                ", hasWiFi=" + hasWiFi;
    }
}
