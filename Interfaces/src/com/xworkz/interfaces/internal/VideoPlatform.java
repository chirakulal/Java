package com.xworkz.interfaces.internal;

public interface VideoPlatform {

    void uploadVideo();
    void likeVideo();
    void commentVideo();

    default void delete(){
        System.out.println("Running delete in VideoPlatform");
    }
}
