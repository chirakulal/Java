package com.xworkz.set.runner;



import com.xworkz.set.dto.MobileCoverDTO;

import java.util.*;

public class MobileCoverRunner {

    public static void main(String[] args) {

        Set<MobileCoverDTO> covers = new HashSet<>();
        covers.add(new MobileCoverDTO("Spigen", "iPhone 13", "Black", "TPU", 899.99, true, true, 25.0, true, "Back Cover"));
        covers.add(new MobileCoverDTO("Caseology", "Samsung S22", "Blue", "Silicone", 799.0, false, true, 22.0, true, "Back Cover"));
        covers.add(new MobileCoverDTO("OtterBox", "iPhone 14", "Red", "Plastic", 1499.5, true, true, 35.0, false, "Flip Cover"));
        covers.add(new MobileCoverDTO("Ringke", "OnePlus 11", "Clear", "TPU", 599.0, false, true, 20.0, true, "Back Cover"));
        covers.add(new MobileCoverDTO("ESR", "iPhone SE", "Green", "Leather", 1299.0, true, false, 30.0, false, "Wallet Cover"));
        covers.add(new MobileCoverDTO("Boat", "Redmi Note 12", "Purple", "Silicone", 499.0, false, true, 18.0, false, "Back Cover"));
        covers.add(new MobileCoverDTO("Noise", "Realme Narzo", "Orange", "Plastic", 349.0, false, false, 28.0, false, "Flip Cover"));
        covers.add(new MobileCoverDTO("UAG", "Pixel 7", "Gray", "Kevlar", 1999.0, true, true, 40.0, true, "Rugged Cover"));
        covers.add(new MobileCoverDTO("Pebble", "Vivo V27", "Blue", "TPU", 299.0, false, false, 19.5, false, "Back Cover"));
        covers.add(new MobileCoverDTO("Amozo", "Poco X5", "Yellow", "Rubber", 699.0, true, true, 27.0, true, "Back Cover"));
        covers.add(new MobileCoverDTO("Pebble", "Vivo V27", "Blue", "TPU", 299.0, false, false, 19.5, false, "Back Cover"));
        Iterator<MobileCoverDTO> iterator = covers.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }






    }
}
