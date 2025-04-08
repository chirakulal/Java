package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Juice;

public class Real extends Juice {

    public Real(){
        super();
        System.out.println("No-arg constructor running in Real");
    }

    @Override
    public void openCap() {
        System.out.println("Running openCap in Juice");
    }
    @Override
    public void pour()
    {
        System.out.println("Running pour in Juice");
    }
    @Override
    public void drink() {
        System.out.println("Running drink in Juice");
    }
    @Override
    public void refrigerate() {
        System.out.println("Running refrigerate in Juice");
    }
    @Override
    public void shakeWell() {
        System.out.println("Running shakeWell in Juice");
    }
}
