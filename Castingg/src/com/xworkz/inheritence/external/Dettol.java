package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Antiseptic;

public class Dettol extends Antiseptic {
    public Dettol(){
        super();
        System.out.println("No-arg constructor running in Dettol");
    }
    @Override
    public void disinfect() {
        System.out.println("Running disinfect in Dettol");
    }
    @Override
    public void killGerms() {
        System.out.println("Running killGerms in Dettol");
    }
    @Override
    public void healFaster() {
        System.out.println("Running healFaster in Dettol");
    }
    @Override
    public void coolBurn() {
        System.out.println("Running coolBurn in Dettol");
    }
    @Override
    public void reduceInfection() {
        System.out.println("Running reduceInfection in Dettol");
    }
}
