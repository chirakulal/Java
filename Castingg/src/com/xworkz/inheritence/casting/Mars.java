package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Earth;
import com.xworkz.inheritence.internal.Planet;

public class Mars {

    public void searchWater(Planet planet){
        planet.rotate();
        planet.maintainGravity();
        planet.revolve();
        planet.experienceSeasons();
        planet.supportLife();
        if(planet instanceof Earth){
            Earth earth = (Earth) planet;
            earth.waterbody();
        }

    }
}
