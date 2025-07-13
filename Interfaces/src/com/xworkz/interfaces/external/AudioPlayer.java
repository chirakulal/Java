package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void pause() {
        System.out.println("Running pause in AudioPlayer");
    }

    @Override
    public void play() {
        System.out.println("Running play in AudioPlayer");
    }

    @Override
    public void stop() {
        System.out.println("Running stop in AudioPlayer");
    }

    @Override
    public void speed() {
        System.out.println("Running speed in AudioPlayer");

    }
}
