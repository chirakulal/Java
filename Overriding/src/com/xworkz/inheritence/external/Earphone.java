package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.AudioDevice;

public class Earphone extends AudioDevice {

    public Earphone(){
        super();
        System.out.println("No-argu const is running");
    }
    @Override
    public void listen() {
        System.out.println("Running listen in Earphone");
    }

    @Override
    public void call() {
        System.out.println("Running call in Earphone");
    }

    @Override
    public void music() {
        System.out.println("Running music in Earphone");
    }

    @Override
    public void beats() {
        System.out.println("Running beats in Earphone");
    }

    @Override
    public void play() {
        System.out.println("Running play in Earphone");
    }

}
