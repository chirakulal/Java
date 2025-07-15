package com.xworkz.mapiterator.dto;

public class JweleryDTO {

    private String type;
    private String designName;
    private String gemstone;
    private double weightInGrams;
    private double price;

    @Override
    public String toString() {
        return "JweleryDTO{" +
                "type='" + type + '\'' +
                ", designName='" + designName + '\'' +
                ", gemstone='" + gemstone + '\'' +
                ", weightInGrams=" + weightInGrams +
                ", price=" + price +
                '}';
    }

    public JweleryDTO(String type, String designName, String gemstone, double weightInGrams, double price) {
        this.type = type;
        this.designName = designName;
        this.gemstone = gemstone;
        this.weightInGrams = weightInGrams;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesignName() {
        return designName;
    }

    public void setDesignName(String designName) {
        this.designName = designName;
    }

    public String getGemstone() {
        return gemstone;
    }

    public void setGemstone(String gemstone) {
        this.gemstone = gemstone;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
