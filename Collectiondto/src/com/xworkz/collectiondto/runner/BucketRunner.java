package com.xworkz.collectiondto.runner;

import com.xworkz.collectiondto.dto.BucketDTO;

import java.util.ArrayList;
import java.util.Collection;

public class BucketRunner {
    public static void main(String[] args) {

        Collection<BucketDTO> bucketRunner = new ArrayList<>();
        bucketRunner.add(new BucketDTO("Milton", "Plastic", 10, "Blue", true, 120.50, "Water Storage"));
        bucketRunner.add(new BucketDTO("Cello", "Stainless Steel", 15, "Silver", true, 250.00, "Kitchen Use"));
        bucketRunner.add(new BucketDTO("Nayasa", "Fiber", 12, "Red", false, 130.75, "Bath Use"));
        bucketRunner.add(new BucketDTO("Supreme", "Polypropylene", 20, "Green", true, 199.99, "Cleaning"));
        bucketRunner.add(new BucketDTO("Princeware", "PVC", 25, "Yellow", true, 225.00, "Gardening"));
        bucketRunner.add(new BucketDTO("Nilkamal", "Plastic", 18, "Black", false, 180.00, "Water Storage"));
        bucketRunner.add(new BucketDTO("Signoraware", "Rubber", 5, "Orange", true, 99.99, "Construction"));
        bucketRunner.add(new BucketDTO("Tupperware", "Acrylic", 10, "White", false, 145.00, "Food Storage"));
        bucketRunner.add(new BucketDTO("Polyset", "Aluminum", 30, "Grey", true, 270.00, "Industrial"));
        bucketRunner.add(new BucketDTO("Pigeon", "Galvanized Iron", 50, "Blue", true, 350.00, "Paint Mixing"));

        for (BucketDTO bucket: bucketRunner){
            System.out.println("Brand : "+bucket.getBrand());
            System.out.println("Color : "+bucket.getColor());
            System.out.println("Material : "+bucket.getMaterial());
            System.out.println("Capacity : "+bucket.getCapacityInLiters());
            System.out.println("UsageType : "+bucket.getUsageType());
            System.out.println("Price : "+bucket.getPrice());

            System.out.println("---------------------------------------");
        }
    }
}
