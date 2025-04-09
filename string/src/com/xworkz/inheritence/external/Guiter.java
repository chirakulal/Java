package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Instrument;

public class Guiter extends Instrument {
        private String brand;
        private int numberOfStrings;
        private boolean isElectric;


        public Guiter(String brand, int numberOfStrings, boolean isElectric) {
            this.brand = brand;
            this.numberOfStrings = numberOfStrings;
            this.isElectric = isElectric;
        }
    @Override
    public void play(){
        System.out.println("Running play in Guiter");
    }
    @Override
    public void keys(){
        System.out.println("Running keys in Guiter");
    }
    @Override
    public void cords(){
        System.out.println("Running cords in Guiter");
    }
    @Override
    public void strings(){
        System.out.println("Running strings in Guiter");
    }
    public void sound(){
        System.out.println("Running sound in Guiter");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", numberOfStrings=" + numberOfStrings +
                ", isElectric=" + isElectric ;
    }
}
