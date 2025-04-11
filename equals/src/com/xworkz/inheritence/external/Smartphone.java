package com.xworkz.inheritence.external;

public class Smartphone  {

    private String brand;
    private int storage;
    private boolean has5G;

    public Smartphone(String brand, int storage, boolean has5G) {
        this.brand = brand;
        this.storage = storage;
        this.has5G = has5G;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", storage=" + storage +
                        ", has5G=" + has5G;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 38;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Smartphone) {
                Smartphone smartphone = this;
                Smartphone smartphone1 = (Smartphone) obj;
                if (smartphone.brand.equals(smartphone1.brand) &&
                        smartphone.storage == smartphone1.storage &&
                        smartphone.has5G == smartphone1.has5G) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
