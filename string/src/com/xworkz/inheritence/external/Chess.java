package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Game;

public class Chess extends Game {
    private int numberOfPlayers;
    private String boardSize;
    private boolean isTimerUsed;


    public Chess(int numberOfPlayers, String boardSize, boolean isTimerUsed) {
        this.numberOfPlayers = numberOfPlayers;
        this.boardSize = boardSize;
        this.isTimerUsed = isTimerUsed;
    }
    @Override
    public void  start(){
        System.out.println("Running method in Chess");
    }
    @Override
    public void  pause(){
        System.out.println("Running method in Chess");
    }
    @Override
    public void  end() {
        System.out.println("Running method in Chess");
    }
    @Override
    public void  reset(){
        System.out.println("Running method in Chess");
    }
    @Override
    public void saveProgress(){
        System.out.println("Running method in Chess");
    }
    public void restart(){
        System.out.println("Running method in Chess");
    }

    @Override
    public String toString() {
        return
                "numberOfPlayers=" + numberOfPlayers +
                ", boardSize='" + boardSize + '\'' +
                ", isTimerUsed=" + isTimerUsed;
    }
}
