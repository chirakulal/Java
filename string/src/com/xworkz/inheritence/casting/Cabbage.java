package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.LeafVeg;
import com.xworkz.inheritence.internal.Vegetable;
import com.xworkz.inheritence.internal.Vehicle;

public class Cabbage {

    public void peel(Vegetable vegetable){
        vegetable.water();
        vegetable.pesticide();
        vegetable.nutrients();
        vegetable.grow();
        vegetable.harvest();
        if(vegetable instanceof LeafVeg){
            LeafVeg leafVeg = (LeafVeg) vegetable;
            leafVeg.growAboveGround();
        }

    }
}
