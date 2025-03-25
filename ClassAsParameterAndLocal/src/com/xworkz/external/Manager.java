package com.xworkz.external;

import com.xworkz.internal.Camera;
import com.xworkz.internal.Type;

public class Manager {

    public void capture(){
        System.out.println("Running capture in camera");

        Camera camera = new Camera();
        camera.setBrand("Sony");
        camera.setPrice(459000);
        camera.setType(Type.COMMUNICATION);
        camera.setConnectivity("good");

        System.out.println(camera.getBrand());
        System.out.println(camera.getType());
        System.out.println(camera.getConnectivity());
        System.out.println(camera.getPrice());
    }
    public void delete(){
        System.out.println("Running delete in camera");
        Camera camera = new Camera();
        camera.setBrand("Sony");
        camera.setPrice(459000);
        camera.setType(Type.COMMUNICATION);
        camera.setConnectivity("good");

        Camera camera1 = new Camera();
        camera1.setBrand("Canvac");
        camera1.setPrice(459000);
        camera1.setType(Type.EARTH_OBSERVATION);
        camera1.setConnectivity("good");

        Camera[] cameras = {camera1,camera1};

        for (Camera camera2 : cameras) {
            System.out.println(camera2.getBrand());
            System.out.println(camera2.getType());
            System.out.println(camera2.getConnectivity());
            System.out.println(camera2.getPrice());
        }

    }
    public void lens(Camera camera){
        System.out.println("Running lens in camera");
        if(camera!=null){
            System.out.println(camera.getBrand());
            System.out.println(camera.getType());
            System.out.println(camera.getConnectivity());
            System.out.println(camera.getPrice());
        }

    }
    public void details(Camera[] cameras){
        System.out.println("Running detals in camera");
        if(cameras!=null){
            for (Camera camera2:cameras){
                System.out.println(camera2.getBrand());
                System.out.println(camera2.getType());
                System.out.println(camera2.getConnectivity());
                System.out.println(camera2.getPrice());
            }
        }
    }
}
