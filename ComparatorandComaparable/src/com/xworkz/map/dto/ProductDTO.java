package com.xworkz.map.dto;

public class ProductDTO implements Comparable<ProductDTO> {
    private String name;
    private double price;

    public ProductDTO(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(ProductDTO other) {
       if(other.getPrice()>100){
           return 1;
       } else if (other.getPrice()==100) {
           return 0;

       }else {
           return -1;
       }
    }

    @Override
    public String toString() {
        return "ProductDTO{name='" + name + "', price=" + price + "}";
    }

    public double getPrice() {
        return price;
    }
}
