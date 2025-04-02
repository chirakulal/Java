package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Species;

public class Wizard extends Species {

    public Wizard(){
        System.out.println("no-argu construct in Wizard");
    }

    public void castSpell(){
        System.out.println("Running castSpell in Wizard");
    }

}
