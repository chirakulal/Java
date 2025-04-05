package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Container;

public class Bottel extends Container {

    public Bottel(){
        super();
        System.out.println("no-argu const is running");
    }
    @Override
    public void fill(){
        System.out.println("Running fill in Bottel");
    }
    @Override
    public void empty(){
        System.out.println("Running empty in Bottel");
    }
    @Override
    public void color(){
        System.out.println("Running co;or in Bottel");
    }
    @Override
    public void size(){
        System.out.println("Running size in Bottel");
    }
    @Override
    public void capacity(){
        System.out.println("Running capacity in Bottel");
    }
}
