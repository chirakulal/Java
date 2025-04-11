package com.xworkz.inheritence.external;

public class Shirts {

    private String brand;
    private int size;
    private String color;

    public Shirts(){
        System.out.println("no-argu const of tShirt");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "tShirts{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("obj is not null");
            if(obj instanceof Shirts){
                System.out.println("obj is tshirts,will compare....");
                Shirts shirts1 = this;
                Shirts shirts2 =(Shirts) obj;
                if(shirts1.brand.equals(shirts2.brand) && shirts1.size==shirts2.size&& shirts1.color.equals(shirts2.color)){
                    System.out.println("both tshirts are same");
                    return true;
                }
            }
        }
        return false;

    }
}
