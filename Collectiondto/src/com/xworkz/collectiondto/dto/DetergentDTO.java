package com.xworkz.collectiondto.dto;

public class DetergentDTO {
    private String brand;
    private String type;
    private double weightInGrams;
    private String fragrance;
    private boolean forMachineWash;
    private double price;
    private String packagingType;

    public DetergentDTO() {
    }

    public DetergentDTO(String brand, String type, double weightInGrams, String fragrance, boolean forMachineWash, double price, String packagingType) {
        this.brand = brand;
        this.type = type;
        this.weightInGrams = weightInGrams;
        this.fragrance = fragrance;
        this.forMachineWash = forMachineWash;
        this.price = price;
        this.packagingType = packagingType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public String getFragrance() {
        return fragrance;
    }

    public void setFragrance(String fragrance) {
        this.fragrance = fragrance;
    }

    public boolean isForMachineWash() {
        return forMachineWash;
    }

    public void setForMachineWash(boolean forMachineWash) {
        this.forMachineWash = forMachineWash;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }
}

