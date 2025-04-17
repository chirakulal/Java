package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Gaming;
import com.xworkz.interfaces.internal.MediaPlayer;

public class SnackCorner implements MediaPlayer, Gaming {

    @Override
    public void pause() {
        System.out.println("Running method in SnackCorner");
    }

    @Override
    public void endGame() {
        System.out.println("Running method in SnackCorner");

    }

    @Override
    public void stop() {
        System.out.println("Running method in SnackCorner");

    }

    @Override
    public void play() {
        System.out.println("Running method in SnackCorner");

    }

    @Override
    public void startGame() {
        System.out.println("Running method in SnackCorner");

    }

    @Override
    public void pauseGame() {
        System.out.println("Running method in SnackCorner");

    }
}
