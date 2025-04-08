package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Appliance;

public class Refrigerator extends Appliance {
    public Refrigerator(){
        super();
        System.out.println("no-argu const is running");
    }
    @Override
    public void cool(){
        System.out.println("Running cool in  Refrigerator");
    }
    @Override
    public void heat(){
        System.out.println("Running heat in  Refrigerator");
    }
    @Override
    public void runThroughElectric(){
        System.out.println("Running eclectricity in  Refrigerator");
    }
    @Override
    public void storethings(){
        System.out.println("Running storethings in  Refrigerator");
    }
    @Override
    public void  condenser(){
        System.out.println("Running condenser in  Refrigerator");
    }
    public void openDoor(){
        System.out.println("Running openDoor in Refrigerator");
    }
}
