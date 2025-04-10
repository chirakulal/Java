package com.xworkz.inheritence.external;



public class Circle{

    private String color;
    private int diameter;
    private boolean isFilled;

    public Circle(String color, int diameter,boolean isFilled){
        this.color=color;
        this.diameter=diameter;
        this.isFilled=isFilled;
    }
    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", diameter=" + diameter +
                ", isFilled=" + isFilled;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :"+super.hashCode());
        return 7;
    }
}
