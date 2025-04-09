package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Animal;

public class Lion extends Animal {
    private String name;
    private int age;
    private boolean isWild;


    public Lion(String name, int age, boolean isWild) {
        this.name = name;
        this.age = age;
        this.isWild = isWild;
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

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", isWild=" + isWild ;
    }
}
