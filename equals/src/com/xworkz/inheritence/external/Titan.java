package com.xworkz.inheritence.external;

public class Titan {
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
                ", isAnalog=" + isAnalog +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 82;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Titan) {
                Titan other = (Titan) obj;
                if (this.modelName.equals(other.modelName)) {
                    System.out.println("Both Titan objects are same based on modelName");
                    return true;
                }
            }
        }
        return false;
    }
}
