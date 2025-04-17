package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.RemoteControl;

public class TVRemote implements RemoteControl {

    @Override
    public void changeChannel() {
        System.out.println("Running changeChannel in RemoteControll ");
    }

    @Override
    public void powerOff() {
        System.out.println("Running powerOff in TVRemote");
    }

    @Override
    public void powerOn() {
        System.out.println("Running poweOn in TVRemote");
    }
}
