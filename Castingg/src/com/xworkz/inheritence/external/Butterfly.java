package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Insect;

public class Butterfly extends Insect {

        public Butterfly() {
            super();
            System.out.println("No-arg constructor is running in Butterfly");
        }
        @Override
    public void crawl() {
        System.out.println("Running crawl in Butterfly");
    }

    @Override
    public void fly() {
        System.out.println("Running fly in Butterfly");
    }

    @Override
    public void feed() {
        System.out.println("Running feed in Butterfly");
    }

    @Override
    public void reproduce() {
        System.out.println("Running reproduce in Butterfly");
    }

    @Override
    public void undergoMetamorphosis() {
        System.out.println("Running undergoMetamorphosis in Butterfly");
    }

    public void suckNectar(){
        System.out.println("Running suckNectar in Butterfly");
    }

}
