package com.xworkz.March20;

public class Clip {

    Color color;

    Clip(Color color){
        this.color = color;
        System.out.println("the color is "+this.color);
    }
    void hold(){
        System.out.println("Running hold function in clip");
    }
}
