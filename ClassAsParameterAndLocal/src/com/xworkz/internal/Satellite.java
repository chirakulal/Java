package com.xworkz.internal;

public class Satellite {

    private Type type;
    private String cost;
    private double weight;
    private double loadCapacity;

    public Satellite(){
        System.out.println("no-argu const is running in Satellite");
    }

    public Type getType(){
        return this.type;
    }
    public String getCost(){
        return this.cost;
    }
    public double getWeight(){
        return this.weight;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setType(Type type){
        this.type=type;
    }
    public void setCost(String cost){
        this.cost=cost;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public void setLoadCapacity(double loadCapacity){
        this.loadCapacity=loadCapacity;
    }



}
