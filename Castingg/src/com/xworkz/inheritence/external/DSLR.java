package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Camera;

public class DSLR extends Camera {

    public DSLR() {
        super();
        System.out.println("No-arg constructor is running in DSLR");
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

}
