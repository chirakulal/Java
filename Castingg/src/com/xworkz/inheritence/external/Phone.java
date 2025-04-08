package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Device;

public class Phone extends Device {

    public Phone(){
        super();
        System.out.println("no-argu const is running on Phone");
    }
    @Override
    public void message(){
        System.out.println("message is running in Phone ");
    }
    @Override
    public void call(){
        System.out.println("Running call in Phone ");
    }
    @Override
    public void playGames(){
        System.out.println("Running playGames in Phone ");
    }
    @Override
    public void videoCall(){
        System.out.println("Running videoCall in Phone ");
    }
    @Override
    public void track(){
        System.out.println("Running track in Phone ");
    }
    public void chat(){
        System.out.println("Running chat in Phone");
    }
}
