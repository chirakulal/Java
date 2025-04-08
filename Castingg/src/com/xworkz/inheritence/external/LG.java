package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Television;

public class LG extends Television {
    public LG(){
        super();
        System.out.println("No-arg constructor is running in LG ");
    }
    @Override
    public void powerOn() {
        System.out.println("Running powerOn in LG");
    }
    @Override
    public void changeChannel() {
        System.out.println("Running changeChannel in LG");
    }
    @Override
    public void adjustVolume() {
        System.out.println("Running adjustVolume in LG");
    }
    @Override
    public void showGuide() {
        System.out.println("Running showGuide in LG");
    }
    @Override
    public void connectHdmi() {
        System.out.println("Running connectHdmi in LG");
    }
}
