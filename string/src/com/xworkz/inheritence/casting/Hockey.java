package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.FootBall;
import com.xworkz.inheritence.internal.Sport;

public class Hockey {

    public void useStick(Sport sport){
        sport.win();
        sport.play();
        sport.practice();
        sport.followRules();
        sport.lose();
        if(sport instanceof FootBall){
            FootBall footBall = new FootBall();
            footBall.goal();
        }

    }
}
