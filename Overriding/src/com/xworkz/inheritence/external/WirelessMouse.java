package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Mouse;

public class WirelessMouse extends Mouse {
    public WirelessMouse() {
        super();
        System.out.println("No-arg constructor in WirelessMouse");
    }
    @Override
    public void click() {
        System.out.println("Running click in WirelessMouse");
    }
    @Override
    public void scroll() {
        System.out.println("Running scroll in WirelessMouse");
    }
    @Override
    public void move() {
        System.out.println("Running move in WirelessMouse");
    }
    @Override
    public void doubleClick() {
        System.out.println("Running doubleClick in WirelessMouse");
    }
    @Override
    public void drag() {
        System.out.println("Running drag in WirelessMouse");
    }
}
