package com.xworkz.set.dto;

import java.util.Objects;

public class LaptopDTO {
    public String brand;
    public String model;
    public int ram;
    public int storage;
    public String processor;
    public double price;
    public boolean touchscreen;
    public double screenSize;
    public String color;
    public String os;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LaptopDTO laptopDTO = (LaptopDTO) o;
        return ram == laptopDTO.ram && storage == laptopDTO.storage && Double.compare(price, laptopDTO.price) == 0 && touchscreen == laptopDTO.touchscreen && Double.compare(screenSize, laptopDTO.screenSize) == 0 && Objects.equals(brand, laptopDTO.brand) && Objects.equals(model, laptopDTO.model) && Objects.equals(processor, laptopDTO.processor) && Objects.equals(color, laptopDTO.color) && Objects.equals(os, laptopDTO.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, ram, storage, processor, price, touchscreen, screenSize, color, os);
    }

    public LaptopDTO(String brand, String model, int ram, int storage, String processor, double price,
                     boolean touchscreen, double screenSize, String color, String os) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
        this.price = price;
        this.touchscreen = touchscreen;
        this.screenSize = screenSize;
        this.color = color;
        this.os = os;
    }

    public LaptopDTO() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "LaptopDTO{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", processor='" + processor + '\'' +
                ", price=" + price +
                ", touchscreen=" + touchscreen +
                ", screenSize=" + screenSize +
                ", color='" + color + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}

