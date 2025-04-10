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
                ", numberOfCompartments=" + numberOfCompartments ;
    }

    @Override
    public int hashCode() {
        return 10;
    }
}
