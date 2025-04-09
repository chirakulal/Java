package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.LEDBulb;
import com.xworkz.inheritence.internal.Light;

public class TubeLight {

    public void On(Light light){
        light.turnOn();
        light.emitLight();
        light.adjustBrightness();
        light.saveEnergy();
        light.turnOff();
        if(light instanceof LEDBulb){
            LEDBulb ledBulb = (LEDBulb) light;
            ledBulb.voltage();
        }
    }
}
