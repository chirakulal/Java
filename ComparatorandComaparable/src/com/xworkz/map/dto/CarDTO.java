package com.xworkz.map.dto;

import lombok.*;


public class CarDTO {
    private String brand;
    private int topSpeed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "brand='" + brand + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public CarDTO(String brand, int topSpeed) {
        this.brand = brand;
        this.topSpeed = topSpeed;
    }
}

