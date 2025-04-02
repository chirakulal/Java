package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Vegetable;

public class RootVeg extends Vegetable {

    public RootVeg(){
        System.out.println("no=argu const is running");
    }

    public void growAboveGround(){
        System.out.println("Running growAboveGround in RootVeg");
    }
}
