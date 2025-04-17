package com.xworkz.interfaces.internal;

public interface GamingConsole {

    void startGame();
    void pauseGame();
    void endGame();

    default void reset(){
        System.out.println("Running reset in Gamingconsole");
    }
}
