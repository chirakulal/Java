package com.xworkz.inheritence.internal;


public class AudioDevice {
    public AudioDevice(){
        System.out.println("no arg const of audiodevice");
    }
    public void listen() {
        System.out.println("Running listen in Headphones");
    }

    public void call() {
        System.out.println("Running call in Headphones");
    }

    public void music() {
        System.out.println("Running music in Headphones");
    }

    public void beats() {
        System.out.println("Running beats in Headphones");
    }

    public void play() {
        System.out.println("Running play in Headphones");
    }

}
