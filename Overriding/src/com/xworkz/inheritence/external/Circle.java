package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Shape;

public class Circle extends Shape {

    public Circle(){
        System.out.println("no-argu const is running");
    }
    @Override
    public void draw() {
        System.out.println("Running Draw in Circle");
    }
    @Override
    public void resize() {
        System.out.println("Running resize in Circle");
    }
    @Override
    public void move() {
        System.out.println("Running move in Circle");
    }
    @Override
    public void rotate() {
        System.out.println("Running rotate in Circle");
    }
    @Override
    public void color() {
        System.out.println("Running Color in Circle");
    }

}
