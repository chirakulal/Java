package com.xworkz.collectiondto.dto;

public class ChappalDTO {
    private String brand;
    private String modelName;
    private String material;
    private String color;
    private int size;
    private double price;
    private boolean inStock;

    @Override
    public String toString() {
        return "ChappalDTO{" +
                "brand='" + brand + '\'' +
                ", modelName='" + modelName + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", inStock=" + inStock +
                '}';
    }

    public ChappalDTO() {
    }
    public ChappalDTO(String brand, String modelName, String material, String color, int size, double price, boolean inStock) {
        this.brand = brand;
        this.modelName = modelName;
        this.material = material;
        this.color = color;
        this.size = size;
        this.price = price;
        this.inStock = inStock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}

