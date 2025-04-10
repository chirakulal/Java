package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.MicrowaveOven;
import com.xworkz.inheritence.internal.Oven;

public class Kitchen {

    public void cook(Oven oven){

        oven.defrost();
        oven.bake();
        oven.grill();
        oven.preheat();
        oven.turnOff();
        if(oven instanceof MicrowaveOven){
            MicrowaveOven microwaveOven = (MicrowaveOven) oven;
            microwaveOven.turnOn();
        }


    }
}
