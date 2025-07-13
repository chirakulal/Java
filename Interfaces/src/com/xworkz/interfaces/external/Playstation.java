package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.GamingConsole;

public class Playstation implements GamingConsole {

    @Override
    public void startGame() {
        System.out.println("Running startGAme in PlayStation");
    }

    @Override
    public void pauseGame() {
        System.out.println("Running pauseGame in PlayStation");
    }

    @Override
    public void endGame() {
        System.out.println("Running endGame in Playstation");
    }

    @Override
    public void reset() {
        System.out.println("Running reset in Gamingconsole");

    }
}
