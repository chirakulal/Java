package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.MusicApp;

public class Spotify implements MusicApp {

    @Override
    public void playSong() {
        System.out.println("Running playSong in Spotify");
    }

    @Override
    public void pauseSong() {
        System.out.println("Running pauseSong in Spotify");
    }

    @Override
    public void downloadSong() {
        System.out.println("Running downloadSong in Spotify");
    }

}
