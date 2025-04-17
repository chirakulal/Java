package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Charger;
import com.xworkz.interfaces.internal.Remote;

public class PowerCorner implements Remote, Charger {

    @Override
    public void changeChannel() {
        System.out.println("Running method changeChannel in PowerCorner");
    }

    @Override
    public void chargeDevice() {
        System.out.println("Running method chargeDevice in PowerCorner");

    }

    @Override
    public void plugIn() {
        System.out.println("Running method plugIn in PowerCorner");

    }

    @Override
    public void turnOffTV() {
        System.out.println("Running method turnOffTV in PowerCorner");

    }

    @Override
    public void turnOnTV() {
        System.out.println("Running method plugIn in PowerCorner");

    }

    @Override
    public void unplug() {
        System.out.println("Running method plugIn in PowerCorner");

    }
}
