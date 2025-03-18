package com.xworkz;

public class Lens {

    public  void clearLens(Camera camera){
        System.out.println("Lens is running");

        if(camera!=null){
            camera.clickPhoto();
        }
        else {
            System.out.println("Reference is pointing to null");
        }
    }
}
