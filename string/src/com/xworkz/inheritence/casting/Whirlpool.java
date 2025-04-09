package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Refrigerator;
import com.xworkz.inheritence.internal.Appliance;

public class Whirlpool {
    
    public void buy(Appliance appliance){
        appliance.cool();
        appliance.heat();
        appliance.condenser();
        appliance.runThroughElectric();
        appliance.storethings();
        if(appliance instanceof Refrigerator){
            Refrigerator refrigerator = new Refrigerator();
            refrigerator.openDoor();
        }
    }
}
