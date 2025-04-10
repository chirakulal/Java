package com.xworkz.inheritence.external;



public class CottonTowel  {
    private String color;
    private String size;
    private int absorbencyLevel;


    public CottonTowel(String color, String size, int absorbencyLevel) {
        this.color = color;
        this.size = size;
        this.absorbencyLevel = absorbencyLevel;
    }


    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", absorbencyLevel=" + absorbencyLevel;
    }

    @Override
    public int hashCode() {
        return 86;
    }
}
