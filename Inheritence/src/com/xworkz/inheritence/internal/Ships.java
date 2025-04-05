package com.xworkz.inheritence.internal;

public class Ships {

    public Ships() {
        System.out.println("No-arg constructor is running in Ship");
    }

    public void sail() {
        System.out.println("Sailing in the ocean");
    }
    public void anchor() {
        System.out.println("Anchoring at port");
    }
    public void carryCargo() {
        System.out.println("Carrying cargo");
    }
    public void navigate() {
        System.out.println("Navigating through water");
    }
    public void signal() {
        System.out.println("Signaling other ships");
    }
}
