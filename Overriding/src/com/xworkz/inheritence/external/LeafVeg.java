package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Vegetable;


public class LeafVeg extends Vegetable {

    public LeafVeg(){
        System.out.println("no-arg const is running");
    }


    public void growAboveGround(){
        System.out.println("Running growAboveGround in Leafveg");
    }

    @Override
    public void grow(){
        System.out.println("Running grow in Leafveg");
    }
    @Override
    public void water(){
        System.out.println("Running water in Leafveg");
    }
    @Override
    public void nutrients(){
        System.out.println("Running nutrients in Leafveg");
    }
    @Override
    public void harvest(){
        System.out.println("Running harvest in Leafveg");
    }

    @Override
    public void pesticide(){
        System.out.println("running pesticide in Leafveg");
    }
}
