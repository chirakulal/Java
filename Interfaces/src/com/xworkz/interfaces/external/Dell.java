package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Laptop;

public class Dell implements Laptop {

    @Override
    public void boot() {
        System.out.println("Running boot in Dell");
    }

    @Override
    public void sleep() {
        System.out.println("Running sleep in Dell");
    }

    @Override
    public void shutdown() {
        System.out.println("Running shutdown in Dell");
    }

    @Override
    public void restart() {
        System.out.println("Running story in SocialMedia");

    }

}
