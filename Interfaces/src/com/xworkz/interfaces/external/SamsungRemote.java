package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Remote;

public class SamsungRemote implements Remote {

    @Override
    public void turnOnTV() {
        System.out.println("Running turnOnTV in SamsungRemote");
    }

    @Override
    public void changeChannel() {
        System.out.println("Running changeChannel in SamsungRemote");
    }

    @Override
    public void turnOffTV() {
        System.out.println("Running turnOffTV in SamsungRemote");
    }
}
