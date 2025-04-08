package com.xworkz.inheritence.internal;

public class Instrument {

    public Instrument(){
        System.out.println("no-argu const is running");
    }

    public void play(){
        System.out.println("Running play in Instrument");
    }
    public void keys(){
        System.out.println("Running keys in instrument");
    }
    public void cords(){
        System.out.println("Running cords in instrument");
    }
    public void strings(){
        System.out.println("Running strings in instrument");
    }
}
