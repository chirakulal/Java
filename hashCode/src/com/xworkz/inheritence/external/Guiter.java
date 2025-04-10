package com.xworkz.inheritence.external;


public class Guiter {
        private String brand;
        private int numberOfStrings;
        private boolean isElectric;


        public Guiter(String brand, int numberOfStrings, boolean isElectric) {
            this.brand = brand;
            this.numberOfStrings = numberOfStrings;
            this.isElectric = isElectric;
        }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", numberOfStrings=" + numberOfStrings +
                ", isElectric=" + isElectric ;
    }

    @Override
    public int hashCode() {
        return 9;
    }
}
