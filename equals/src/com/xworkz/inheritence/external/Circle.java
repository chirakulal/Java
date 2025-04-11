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

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("ref is not null");
            if(obj instanceof Circle){
                Circle circle = this;
                Circle circle1 = (Circle) obj;
                if(circle1.isFilled==circle.isFilled&& circle.color.equals(circle1.color)&&circle1.diameter==circle.diameter){
                    System.out.println("Both are same");
                    return false;
                }
            }
        }
        return false;
    }
}
