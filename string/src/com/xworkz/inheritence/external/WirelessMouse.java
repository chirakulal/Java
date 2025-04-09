package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Mouse;

public class WirelessMouse extends Mouse {
    private String brand;
    private int batteryLife;
    private int dpi;


    public WirelessMouse(String brand, int batteryLife, int dpi) {
        this.brand = brand;
        this.batteryLife = batteryLife;
        this.dpi = dpi;
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

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", batteryLife=" + batteryLife +
                ", dpi=" + dpi ;
    }
}
