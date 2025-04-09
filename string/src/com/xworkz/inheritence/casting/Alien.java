package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Wizard;
import com.xworkz.inheritence.internal.Species;

public class Alien {

    public void search(Species species){
        species.alive();
        species.defend();
        species.attack();
        species.move();
        species.speak();
        if(species instanceof Wizard){
            Wizard wizard = (Wizard) species;
            wizard.castSpell();
        }
    }
}
