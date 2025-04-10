package com.xworkz.inheritence.external;


public class PaintBrush  {
    private String brand;
    private int brushSize;
    private boolean isSynthetic;

    public PaintBrush(String brand, int brushSize, boolean isSynthetic) {
        this.brand = brand;
        this.brushSize = brushSize;
        this.isSynthetic = isSynthetic;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", brushSize=" + brushSize +
                ", isSynthetic=" + isSynthetic;
    }

    @Override
    public int hashCode() {
        return 23;
    }
}
