package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Headphones;

public class Boat extends Headphones {

    public Boat(){
        super();
        System.out.println("No-arg Constructor running in Boat");
    }
    @Override
    public void playMusic() {
        System.out.println("Running playMusic in Boat");
    }
    @Override
    public void pauseMusic() {
        System.out.println("Running pauseMusic in Boat");
    }
    @Override
    public void increaseVolume() {
        System.out.println("Running increaseVolume in Boat");
    }
    @Override
    public void decreaseVolume() {
        System.out.println("Running decreaseVolume in Boat");
    }
    @Override
    public void charge() {
        System.out.println("Running charge in Boat");
    }
}
