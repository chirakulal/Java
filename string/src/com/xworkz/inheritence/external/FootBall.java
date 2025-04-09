package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Sport;

public class FootBall extends Sport {
    private String brand;
    private int size;
    private boolean isOfficial;


    public FootBall(String brand, int size, boolean isOfficial) {
        this.brand = brand;
        this.size = size;
        this.isOfficial = isOfficial;
    }

    @Override
    public void play() {
        System.out.println("Running play in FootBall");
    }

    @Override
    public void practice() {
        System.out.println("Running practice in FootBall");
    }

    @Override
    public void win() {
        System.out.println("Running win in FootBall");
    }

    @Override
    public void lose() {
        System.out.println("Running lose in FootBall");
    }

    @Override
    public void followRules() {
        System.out.println("Running followRules in FootBall");
    }

    public void goal(){
        System.out.println("Running goal in FootBall");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", isOfficial=" + isOfficial ;
    }
}
