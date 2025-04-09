package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Shape;

public class Circle extends Shape {

    private String color;
    private int diameter;
    private boolean isFilled;

    public Circle(String color, int diameter,boolean isFilled){
        this.color=color;
        this.diameter=diameter;
        this.isFilled=isFilled;
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

    public void cut(){
        System.out.println("Running cut in Circle");
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", diameter=" + diameter +
                ", isFilled=" + isFilled;
    }
}
