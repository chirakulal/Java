package com.xworkz.interfaces.internal;

public interface Gaming {

    void startGame();
    void pauseGame();
    void endGame();

    default void nextGame(){
        System.out.println("Running nectGame in Gamming");
    }

}
