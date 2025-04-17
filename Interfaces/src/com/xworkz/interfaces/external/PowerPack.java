package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Alarm;
import com.xworkz.interfaces.internal.Charger;

public class PowerPack implements Charger, Alarm {

    @Override
    public void unplug() {
        System.out.println("Running method in PowerPack");
    }

    @Override
    public void plugIn() {
        System.out.println("Running method in PowerPack");

    }

    @Override
    public void chargeDevice() {
        System.out.println("Running method in PowerPack");

    }

    @Override
    public void snooze() {
        System.out.println("Running method in PowerPack");

    }

    @Override
    public void stopAlarm() {
        System.out.println("Running method in PowerPack");

    }

    @Override
    public void setAlarm() {
        System.out.println("Running method in PowerPack");

    }


}
