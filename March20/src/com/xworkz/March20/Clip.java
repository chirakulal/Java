package com.xworkz.March20;

public class Clip {

    String color;

    Clip(String color){
        this.color = color;
        System.out.println("the color is "+this.color);
    }
    void hold(){
        System.out.println("Running hold function in clip");
    }
}
