package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Drawing;

public class PaintBrush extends Drawing {
    private String brand;
    private int brushSize;
    private boolean isSynthetic;

    public PaintBrush(String brand, int brushSize, boolean isSynthetic) {
        this.brand = brand;
        this.brushSize = brushSize;
        this.isSynthetic = isSynthetic;
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
    public void mixColor(){
        System.out.println("Running mixColor in PaintBrush");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", brushSize=" + brushSize +
                ", isSynthetic=" + isSynthetic;
    }
}
