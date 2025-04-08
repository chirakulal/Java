package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Species;

public class Wizard extends Species {

    public Wizard(){
        System.out.println("no-argu construct in Wizard");
    }

    public void castSpell(){
        System.out.println("Running castSpell in Wizard");
    }

    public void alive(){

        System.out.println("Running alive in Wizard");
    }
    public void move()
    {
        System.out.println("Running move in Wizard");
    }
    public void attack(){

        System.out.println("Running attack in Wizard");
    }
    public void defend()
    {
        System.out.println("Running attack in Wizard");
    }
    public void speak()
    {
        System.out.println("Running speak in Wizard");
    }

}
