package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Door;

public class WoodenDoor extends Door {
    public WoodenDoor(){
        super();
        System.out.println("No-argu constructor is running in WoodenDoor");
    }
    @Override
    public void open() {
        System.out.println("Running open in WoodenDoor");
    }

    @Override
    public void close() {
        System.out.println("Running close in WoodenDoor");
    }

    @Override
    public void lock() {
        System.out.println("Running lock in WoodenDoor");
    }

    @Override
    public void unlock() {
        System.out.println("Running unlock in WoodenDoor");
    }

    @Override
    public void material() {
        System.out.println("Running material in WoodenDoor");
    }

}
