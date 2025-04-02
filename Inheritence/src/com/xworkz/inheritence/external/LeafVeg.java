package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Vegetable;


public class LeafVeg extends Vegetable {

    public LeafVeg(){
        System.out.println("no-arg const is running");
    }

    public void growAboveGround(){
        System.out.println("Running growAboveGround in Leafveg");
    }
}
