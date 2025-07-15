package com.xworkz.mapiterator.dto;

public class BagDTO {

    private String brand;
    private String color;
    private double price;
    private double capacityInLiters;
    private String material;
    private boolean isWaterResistant;
    private int numberOfCompartments;
    private String type;
    private double weightInKg;
    private String originCountry;

    public BagDTO(String brand, String color, double price, double capacityInLiters, String material, boolean isWaterResistant, int numberOfCompartments, String type, double weightInKg, String originCountry) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.capacityInLiters = capacityInLiters;
        this.material = material;
        this.isWaterResistant = isWaterResistant;
        this.numberOfCompartments = numberOfCompartments;
        this.type = type;
        this.weightInKg = weightInKg;
        this.originCountry = originCountry;
    }

    @Override
    public String toString() {
        return "BagDTO{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", capacityInLiters=" + capacityInLiters +
                ", material='" + material + '\'' +
                ", isWaterResistant=" + isWaterResistant +
                ", numberOfCompartments=" + numberOfCompartments +
                ", type='" + type + '\'' +
                ", weightInKg=" + weightInKg +
                ", originCountry='" + originCountry + '\'' +
                '}';
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCapacityInLiters() {
        return capacityInLiters;
    }

    public void setCapacityInLiters(double capacityInLiters) {
        this.capacityInLiters = capacityInLiters;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
    }

    public int getNumberOfCompartments() {
        return numberOfCompartments;
    }

    public void setNumberOfCompartments(int numberOfCompartments) {
        this.numberOfCompartments = numberOfCompartments;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
}
