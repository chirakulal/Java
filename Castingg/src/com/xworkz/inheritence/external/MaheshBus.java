package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Bus;

public class MaheshBus extends Bus {
    public MaheshBus(){
        super();
        System.out.println("no-argu constructor is running in MaheshBus");
    }
    @Override
    public void ticket() {
        System.out.println("Running ticket in MaheshBus");
    }

    @Override
    public void pass() {
        System.out.println("Running pass in MaheshBus");
    }

    @Override
    public void seat() {
        System.out.println("Running seat in MaheshBus");
    }


    @Override
    public void stand() {
        System.out.println("Running stand in MaheshBus");
    }

    @Override
    public void reserved() {
        System.out.println("Running reserved in MaheshBus");
    }

}
