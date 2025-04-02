package com.xworkz.inheritence.internal;

import com.xworkz.inheritence.external.Ship;

public class Shape {

    public Shape(){
        System.out.println("no-argu const is running");
    }


    public void draw() {
        System.out.println("Running Draw in shape");
    }
    public void resize() {
        System.out.println("Running resize in shape");
    }
    public void move() {
        System.out.println("Running move in shape");
    }
    public void rotate() {
        System.out.println("Running rotate in shape");
    }
    public void color() {
        System.out.println("Running Color in shape");
    }

}
