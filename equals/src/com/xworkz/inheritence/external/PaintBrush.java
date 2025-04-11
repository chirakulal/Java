package com.xworkz.inheritence.external;

public class PaintBrush {
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
        System.out.println("Parent :" + super.hashCode());
        return 23;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof PaintBrush) {
                PaintBrush paintbrush = this;
                PaintBrush paintbrush1 = (PaintBrush) obj;
                if (paintbrush.brand.equals(paintbrush1.brand) &&
                        paintbrush.brushSize == paintbrush1.brushSize &&
                        paintbrush.isSynthetic == paintbrush1.isSynthetic) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
