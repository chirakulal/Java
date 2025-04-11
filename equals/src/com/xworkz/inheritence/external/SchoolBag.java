package com.xworkz.inheritence.external;

public class SchoolBag {

    private String brand;
    private String color;
    private int numberOfCompartments;

    public SchoolBag(String brand, String color, int numberOfCompartments) {
        this.brand = brand;
        this.color = color;
        this.numberOfCompartments = numberOfCompartments;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", color='" + color + '\'' +
                        ", numberOfCompartments=" + numberOfCompartments;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof SchoolBag) {
                SchoolBag bag1 = this;
                SchoolBag bag2 = (SchoolBag) obj;
                if (bag1.brand.equals(bag2.brand) &&
                        bag1.color.equals(bag2.color) &&
                        bag1.numberOfCompartments == bag2.numberOfCompartments) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
