package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Sport;

public class FootBall extends Sport {
    public FootBall(){
        super();
        System.out.println("no-argu constructor is running");
    }
    @Override
    public void play() {
        System.out.println("Running play in FootBall");
    }

    @Override
    public void practice() {
        System.out.println("Running practice in FootBall");
    }

    @Override
    public void win() {
        System.out.println("Running win in FootBall");
    }

    @Override
    public void lose() {
        System.out.println("Running lose in FootBall");
    }

    @Override
    public void followRules() {
        System.out.println("Running followRules in FootBall");
    }

    public void goal(){
        System.out.println("Running goal in FootBall");
    }
}
