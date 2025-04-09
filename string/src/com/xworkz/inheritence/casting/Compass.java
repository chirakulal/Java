package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Watch;
import com.xworkz.inheritence.internal.Timepiece;

public class Compass {

    public void direction(Timepiece timepiece){
        timepiece.startTimer();
        timepiece.setAlarm();
        timepiece.displayTime();
        timepiece.checkBattery();
        timepiece.adjustTime();
        if(timepiece instanceof Watch){
            Watch watch = (Watch) timepiece;
            watch.call();
        }

    }
}
