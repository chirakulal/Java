package com.xworkz.internal;

public class Camera {
    private String brand;
    private double price;
    private Type type;
    private String connectivity;

    public Camera(){
        System.out.println("no-argu const is running");
    }
    public String getBrand(){
        return this.brand;
    }
    public double getPrice(){
        return  this.price;
    }
    public Type getType(){
        return this.type;
    }
    public String getConnectivity(){
        return this.connectivity;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setType(Type type){
        this.type=type;
    }
    public void setConnectivity(String connectivity){
        this.connectivity=connectivity;
    }
}
