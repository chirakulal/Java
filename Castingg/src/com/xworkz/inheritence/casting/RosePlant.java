package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Flower;
import com.xworkz.inheritence.external.Rose;

public class RosePlant {

    public void plant(Flower flower){
        flower.provideNectar();
        flower.releaseFragrance();
        flower.attractBees();
        flower.bloom();
        flower.absorbSunlight();
        if(flower instanceof Rose){
            Rose rose =(Rose) flower;
            rose.buy();
        }

    }
}
