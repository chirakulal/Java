package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Animal;

public class Lion extends Animal {
    public Lion(){
        System.out.println("no arg const is running");
    }

    @Override
    public void eat(){
        System.out.println("Running eat in Lion");
    }
    @Override
    public void sleep(){
        System.out.println("Running sleep in Lion");
    }
    @Override
    public void breathe(){
        System.out.println("Running breathe in Lion");
    }
    @Override
    public void walk(){
        System.out.println("Running walk in Lion");
    }
    @Override
    public void makesound(){
        System.out.println("Running makesound in Lion");
    }

    public void roar(){
        System.out.println("Runni");
    }
}
