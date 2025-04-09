package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Circle;
import com.xworkz.inheritence.internal.Shape;

public class Rectangle {

    public void size(Shape shape){
        shape.rotate();
        shape.move();
        shape.resize();
        shape.draw();
        shape.color();
        if(shape instanceof Circle){

            Circle circle = (Circle)shape;
            circle.cut();
        }
    }
}
