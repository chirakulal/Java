package com.xworkz.abstractclass.internal;

public abstract class Bottle {

    public String material;
    public int capacity;
    public String color;

    public Bottle(String material,int capacity,String color){
        this.material=material;
        this.capacity=capacity;
        this.color=color;
    }
    public void fill(){
        System.out.println("The material: "+this.material+" the capacity is : "+this.capacity+" the color is : "+this.color);
    }


}
