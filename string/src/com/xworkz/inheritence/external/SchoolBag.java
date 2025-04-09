package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Bag;

public class SchoolBag extends Bag {

        private String brand;
        private String color;
        private int numberOfCompartments;


        public SchoolBag(String brand, String color, int numberOfCompartments) {
            this.brand = brand;
            this.color = color;
            this.numberOfCompartments = numberOfCompartments;
        }

    @Override
    public void toStore(){
        System.out.println("Running tostore in SchoolBag");
    }
    @Override
    public void keepThings(){
        System.out.println("running keepthings in SchoolBag");
    }
    @Override
    public void closeZip(){
        System.out.println("Running closezip in SchoolBag");
    }
    @Override
    public void openZip(){
        System.out.println("Running openZip in SchoolBag");
    }
    @Override
    public void size(){
        System.out.println("Running size in SchoolBag");
    }
    public  void order(){
        System.out.println("Running order in SchoolBag");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", numberOfCompartments=" + numberOfCompartments ;
    }
}
