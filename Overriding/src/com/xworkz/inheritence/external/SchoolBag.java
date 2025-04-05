package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Bag;

public class SchoolBag extends Bag {

    public SchoolBag(){
        super();
        System.out.println("no-argu const is running");
    }

    @Override
    public void toStore(){
        System.out.println("Running tostore in SchoolBag");
    }
    @Override
    public void keepThings(){
        System.out.println("running keepthings in SchoolBag");
    }
    @Override
    public void closeZip(){
        System.out.println("Running closezip in SchoolBag");
    }
    @Override
    public void openZip(){
        System.out.println("Running openZip in SchoolBag");
    }
    @Override
    public void size(){
        System.out.println("Running size in SchoolBag");
    }
}
