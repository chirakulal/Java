package com.xworkz.inheritence.external;

public class TeddyBear  {
    private String name;
    private String color;
    private String size;


    public TeddyBear(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size ;
    }

    @Override
    public int hashCode() {
        return 21;
    }
}
