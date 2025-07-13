package com.xworkz.interfaces.internal;

public interface Streaming {

    void playVideo();
    void pauseVideo();
    void stopVideo();
    default void react(){
        System.out.println("Running react inStreaming");
    }
}
