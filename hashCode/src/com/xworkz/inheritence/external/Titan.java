package com.xworkz.inheritence.external;

public class Titan  {
    private String modelName;
    private double price;
    private boolean isAnalog;


    public Titan(String modelName, double price, boolean isAnalog) {
        this.modelName = modelName;
        this.price = price;
        this.isAnalog = isAnalog;
    }


    @Override
    public String toString() {
        return "Titan{" +
                "modelName='" + modelName + '\'' +
                ", price=" + price +
                ", isAnalog=" + isAnalog ;
    }

    @Override
    public int hashCode() {
        return 82;
    }
}
