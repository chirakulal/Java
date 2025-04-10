package com.xworkz.inheritence.external;


public class Smartphone  {

    private String brand;
    private int storage;
    private boolean has5G;


    public Smartphone(String brand, int storage, boolean has5G) {
        this.brand = brand;
        this.storage = storage;
        this.has5G = has5G;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", storage=" + storage +
                ", has5G=" + has5G ;
    }

    @Override
    public int hashCode() {
        return 38;
    }
}
