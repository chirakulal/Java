package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Charger;

public class MiCharger implements Charger {

    @Override
    public void plugIn() {
        System.out.println("Running plugIn in MiCharger");
    }

    @Override
    public void chargeDevice() {
        System.out.println("Running chargeDevice in MiCharger");
    }

    @Override
    public void unplug() {
        System.out.println("Running unplug in MiCharger");
    }

    @Override
    public void KeepitSafe() {
        System.out.println("running keepitSafe in Charger");

    }
}
