package com.xworkz.inheritence.external;


public class Chess  {
    private int numberOfPlayers;
    private String boardSize;
    private boolean isTimerUsed;


    public Chess(int numberOfPlayers, String boardSize, boolean isTimerUsed) {
        this.numberOfPlayers = numberOfPlayers;
        this.boardSize = boardSize;
        this.isTimerUsed = isTimerUsed;
    }
    @Override
    public String toString() {
        return
                "numberOfPlayers=" + numberOfPlayers +
                ", boardSize='" + boardSize + '\'' +
                ", isTimerUsed=" + isTimerUsed;
    }

    @Override
    public int hashCode() {
        return 25;
    }
}
