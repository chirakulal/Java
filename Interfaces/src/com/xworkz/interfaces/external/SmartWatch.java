package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.SmartDevice;

public class SmartWatch implements SmartDevice {

    @Override
    public void connect() {
        System.out.println("Running connect in SmartWatch");
    }
    @Override
    public void disconnect() {
        System.out.println("Running disconnect in SmartWatch");
    }
    @Override
    public void update() {
        System.out.println("Running update in SmartWatch");
    }

    @Override
    public void themeChange() {
        System.out.println("Running themeChnage in SmartDevice");

    }
}
