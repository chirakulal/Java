package com.xworkz.collectiondto.runner;

import com.xworkz.collectiondto.dto.ChappalDTO;

import java.util.ArrayList;
import java.util.Collection;

public class ChappalRunner {

    public static void main(String[] args) {
        Collection<ChappalDTO> chappalRunner = new ArrayList<>();
        chappalRunner.add(new ChappalDTO("Bata", "ClassicFlip", "Rubber", "Black", 8, 299.99, true));
        chappalRunner.add(new ChappalDTO("Puma", "StreetRunner", "EVA", "Blue", 9, 499.00, true));
        chappalRunner.add(new ChappalDTO("Adidas", "AquaWalk", "Synthetic", "White", 7, 649.50, false));
        chappalRunner.add(new ChappalDTO("Relaxo", "LiteComfort", "Foam", "Red", 6, 199.00, true));
        chappalRunner.add(new ChappalDTO("Nike", "UrbanStep", "Mesh", "Grey", 10, 799.99, false));
        chappalRunner.add(new ChappalDTO("Reebok", "SoftGrip", "Leather", "Brown", 9, 899.00, true));
        chappalRunner.add(new ChappalDTO("Sparx", "FlexiStep", "PVC", "Blue", 8, 350.75, true));
        chappalRunner.add(new ChappalDTO("Woodland", "MaxCushion", "PU", "Tan", 11, 999.00, false));
        chappalRunner.add(new ChappalDTO("Liberty", "SpringToe", "Fabric", "Green", 7, 429.00, true));
        chappalRunner.add(new ChappalDTO("Paragon", "GlideWalk", "Synthetic", "Maroon", 6, 299.00, true));


        for(ChappalDTO chappal: chappalRunner){

            System.out.println("Brand : "+chappal.getBrand());
            System.out.println("ModelName : "+chappal.getModelName());
            System.out.println("Color : "+chappal.getColor());
            System.out.println("Size : "+chappal.getSize());
            System.out.println("Price : "+chappal.getPrice());
            System.out.println("Material : "+chappal.getMaterial());

            System.out.println("-----------------------------------------------------------");



        }
    }
}
