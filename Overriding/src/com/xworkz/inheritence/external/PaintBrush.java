package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Drawing;

public class PaintBrush extends Drawing {
    public PaintBrush(){
        super();
        System.out.println("no-argu const is running in paintbrush");
    }
    @Override
    public void colourFull(){
        System.out.println("Running colorfull in PaintBrush");
    }
    @Override
    public void clean(){
        System.out.println("Running clean in PaintBrush");
    }
    @Override
    public void dry(){
        System.out.println("Running dry in PaintBrush");
    }
    @Override
    public void dipInPaint(){
        System.out.println("Running dipInPaint in PaintBrush");
    }
    @Override
    public void use(){
        System.out.println("Running use in PaintBrush");
    }
}
