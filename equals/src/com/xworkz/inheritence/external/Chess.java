package com.xworkz.inheritence.external;

public class Chess {
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
        System.out.println("Parent :" + super.hashCode());
        return 25;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Chess) {
                Chess chess = this;
                Chess chess1 = (Chess) obj;
                if (chess.numberOfPlayers == chess1.numberOfPlayers &&
                        chess.boardSize.equals(chess1.boardSize) &&
                        chess.isTimerUsed == chess1.isTimerUsed) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
