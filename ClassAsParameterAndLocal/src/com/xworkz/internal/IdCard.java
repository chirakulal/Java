package com.xworkz.internal;

public class IdCard {
    //material,colors[],weight,designedBy

    private String material;
    private String[] color;
    private double weight;
    private String designedBy;


    public IdCard(){
        System.out.println("no-arg Const running in IdCard");
    }

    public String getMaterial(){
        return this.material;
    }

    public String[] getColor(){
        return this.color;
    }

    public double getWeight(){
        return this.weight;
    }

    public String getDesignedBy(){
        return this.designedBy;
    }

    public void setMaterial(String material){
        this.material=material;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public void setColor(String[] color){
        this.color =color;

    }
    public  void  setDesignedBy(String designedBy){
        this.designedBy=designedBy;
    }
}
