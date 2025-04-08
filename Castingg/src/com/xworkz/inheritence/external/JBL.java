package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Speaker;

public class JBL extends Speaker {
    public JBL(){
        super();
        System.out.println("No-arg Constructor is running in JBL");
    }
    @Override
    public void playSound() {
        System.out.println("Running playSound in JBL");
    }
    @Override
    public void connectBluetooth() {
        System.out.println("Running connectBluetooth in JBL");
    }
    @Override
    public void adjustVolume() {
        System.out.println("Running adjustVolume in JBL");
    }
    @Override
    public void charge() {
        System.out.println("Running charge in JBL");
    }
    @Override
    public void turnOff() {
        System.out.println("Running turnOff in JBL");
    }
}
