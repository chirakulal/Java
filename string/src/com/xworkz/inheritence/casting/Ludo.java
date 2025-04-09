package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Chair;
import com.xworkz.inheritence.external.Chess;
import com.xworkz.inheritence.internal.Game;

public class Ludo {

    public void diceRoll(Game game){
        game.start();
        game.saveProgress();
        game.end();
        game.reset();
        game.pause();
        if(game instanceof Chess){
            Chess chess=(Chess) game;
            chess.restart();
        }
    }
}
