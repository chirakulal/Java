package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Everest;
import com.xworkz.inheritence.internal.Mountain;

public class Hiking {

    public void climb(Mountain mountain){
        mountain.supportEcosystem();
        mountain.experienceWeatherChanges();
        mountain.standTall();
        mountain.provideResources();
        mountain.attractTourists();
        if(mountain instanceof Everest){
            Everest everest = new Everest();
            everest.tall();
        }
    }
}
