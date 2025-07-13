package com.xworkz.collectionmethod.dto;

public class MobileCoverDTO {

    private String brand;
    private String model;
    private String color;
    private String material;
    private double price;
    public boolean waterproof;
    public boolean scratchResistant;
    public double weight;
    public boolean wirelessChargingSupport;
    public String type;

    public MobileCoverDTO() {

    }


    public MobileCoverDTO(String brand, String model, String color, String material, double price, boolean waterproof, boolean scratchResistant, double weight, boolean wirelessChargingSupport, String type) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.material = material;
        this.price = price;
        this.waterproof = waterproof;
        this.scratchResistant = scratchResistant;
        this.weight = weight;
        this.wirelessChargingSupport = wirelessChargingSupport;
        this.type = type;
    }



    @Override
    public String toString() {
        return "MobileCoverDTO{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                ", waterproof=" + waterproof +
                ", scratchResistant=" + scratchResistant +
                ", weight=" + weight +
                ", wirelessChargingSupport=" + wirelessChargingSupport +
                ", type='" + type + '\'' +
                '}';
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public boolean isScratchResistant() {
        return scratchResistant;
    }

    public void setScratchResistant(boolean scratchResistant) {
        this.scratchResistant = scratchResistant;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isWirelessChargingSupport() {
        return wirelessChargingSupport;
    }

    public void setWirelessChargingSupport(boolean wirelessChargingSupport) {
        this.wirelessChargingSupport = wirelessChargingSupport;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
