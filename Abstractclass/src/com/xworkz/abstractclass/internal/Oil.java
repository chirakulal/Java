package com.xworkz.abstractclass.internal;

public abstract class Oil {

    public String type;
    public int quantity;
    public String brand;
    public double price;

    public Oil(String type){
        this.type=type;

    }
    public Oil(String type,int quantity){
        this(type);
        this.quantity=quantity;

    }

    public Oil(String type, int quantity,String brand){
        this(type,quantity);
        this.brand=brand;

    }

    public  Oil(String type, int quantity,String brand,double price){
        this(type,quantity,brand);
        this.price=price;

    }

}
