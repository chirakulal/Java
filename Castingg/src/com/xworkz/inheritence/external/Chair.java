package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Furniture;

public class Chair extends Furniture {
    public Chair(){
        super();
        System.out.println("no-argu const is running");
    }
    @Override
    public void sit(){
        System.out.println("Running sit in Chair");
    }
    @Override
    public void sleep(){
        System.out.println("Running sleep in Chair");
    }
    @Override
    public void showcase(){
        System.out.println("Running showcase in Chair");
    }
    @Override
    public void tostore(){
        System.out.println("Running tostore in Chair");
    }
    @Override
    public void design(){
        System.out.println("Running design in Chair");
    }
    public void buy(){
        System.out.println("Running buy in Chair");
    }
}
