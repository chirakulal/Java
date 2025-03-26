package com.xworkz.encapsulation;

public class Mirror {

    private String shape;
    private int price;

    public Mirror(){
        System.out.println("no-argu const is running");
    }

    public String getShape(){
        return this.shape;
    }
    public int getPrice(){
        return this.price;
    }
     void setShape(String shape){
        this.shape=shape;
    }
     void setPrice(int price){
        this.price=price;
    }
}
