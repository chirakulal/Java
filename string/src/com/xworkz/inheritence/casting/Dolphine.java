package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Shark;
import com.xworkz.inheritence.internal.Fish;

public class Dolphine {

    public void swim(Fish fish){
        fish.swim();
        fish.layEggs();
        fish.eatPlankton();
        fish.camouflage();
        fish.breatheUnderwater();
        if(fish instanceof Shark){
            Shark shark =(Shark) fish;
            shark.eatSmallFish();
        }
    }
}
