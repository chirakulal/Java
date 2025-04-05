package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Instrument;

public class Guiter extends Instrument {

    public Guiter(){
        super();
        System.out.println("no-argu const is running in Guiter");
    }
    @Override
    public void play(){
        System.out.println("Running play in Guiter");
    }
    @Override
    public void keys(){
        System.out.println("Running keys in Guiter");
    }
    @Override
    public void cords(){
        System.out.println("Running cords in Guiter");
    }
    @Override
    public void strings(){
        System.out.println("Running strings in Guiter");
    }

}
