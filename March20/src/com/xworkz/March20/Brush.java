package com.xworkz.March20;

public class Brush {

   Color color;

    Brush(Color color){
        this.color=color;
        System.out.println("the color is "+color);
    }

    void clean(){
        System.out.println("running clean in Brush class");
    }
    void scrub(){
        System.out.println("running scrub in Brush class");
    }

}
