package com.xworkz.interfaces.internal;

public interface MediaPlayer {

    void play();
    void pause();
    void stop();

    default void speed(){
        System.out.println("Running speed in MediaPlayer");
    }
}
