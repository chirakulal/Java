package com.xworkz.collectiondto.runner;

import com.xworkz.collectiondto.dto.DetergentDTO;

import java.util.ArrayList;
import java.util.Collection;

public class DetergentRunner {

    public static void main(String[] args) {

        Collection<DetergentDTO> detergent = new ArrayList<>();
        detergent.add(new DetergentDTO("Surf Excel", "Powder", 1000.0, "Lemon", true, 120.00, "Pouch"));
        detergent.add(new DetergentDTO("Ariel", "Liquid", 500.0, "Jasmine", true, 150.50, "Bottle"));
        detergent.add(new DetergentDTO("Tide", "Bar", 250.0, "Lavender", false, 30.00, "Box"));
        detergent.add(new DetergentDTO("Rin", "Powder", 750.0, "Fresh Linen", false, 80.00, "Pouch"));
        detergent.add(new DetergentDTO("Wheel", "Powder", 1000.0, "Citrus", false, 95.00, "Sachet"));
        detergent.add(new DetergentDTO("Henko", "Liquid", 1500.0, "Rose", true, 180.00, "Bottle"));
        detergent.add(new DetergentDTO("Ghadi", "Bar", 300.0, "Aloe Vera", false, 25.50, "Carton"));
        detergent.add(new DetergentDTO("Nirma", "Powder", 500.0, "No Fragrance", false, 45.00, "Box"));
        detergent.add(new DetergentDTO("Mr. White", "Gel", 600.0, "Ocean Breeze", true, 110.00, "Jar"));
        detergent.add(new DetergentDTO("Fab", "Liquid", 1000.0, "Sandalwood", true, 135.75, "Bottle"));

        for(DetergentDTO detergents :detergent){
            System.out.println("Brand : "+detergents.getBrand().toString());
            System.out.println("Fragrance : "+detergents.getFragrance().toString());
            System.out.println("Type : "+detergents.getType().toString());
            System.out.println("Packaging : "+detergents.getPackagingType().toString());
            System.out.println("Price : "+ detergents.getPrice());
            System.out.println("WeightInGrams : "+detergents.getWeightInGrams());

            System.out.println("----------------------------------------------------------");

        }
    }
}
