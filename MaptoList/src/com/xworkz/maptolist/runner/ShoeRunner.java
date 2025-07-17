package com.xworkz.maptolist.runner;

import com.xworkz.maptolist.dto.MobileDto;
import com.xworkz.maptolist.dto.ShoeDto;

import java.util.*;

public class ShoeRunner {

    public static void main(String[] args) {
        Map<String, ShoeDto> map = new HashMap<>();

        map.put("Nike", new ShoeDto("Nike", "Running", 4999.99, 9, "Mesh", "Black", "Vietnam", true, "AirZoom", "SportPro"));
        map.put("Adidas", new ShoeDto("Adidas", "Sneakers", 3799.50, 8, "Leather", "White", "Indonesia", false, "CloudFoam", "StreetStyle"));
        map.put("Puma", new ShoeDto("Puma", "Training", 4299.00, 10, "PU", "Red", "India", true, "Ignite", "FitZone"));
        map.put("Reebok", new ShoeDto("Reebok", "Walking", 2599.75, 9, "Mesh", "Blue", "China", true, "MemoryTech", "HealthHub"));
        map.put("Skechers", new ShoeDto("Skechers", "Casual", 3899.99, 8, "Canvas", "Grey", "USA", false, "GoWalk", "UrbanFootwear"));
        map.put("Asics", new ShoeDto("Asics", "Running", 5699.25, 10, "Knit", "Orange", "Japan", true, "GelCushion", "MarathonZone"));
        map.put("New Balance", new ShoeDto("New Balance", "Sports", 4199.00, 9, "Mesh", "Navy", "USA", true, "FreshFoam", "FitnessTrend"));
        map.put("Fila", new ShoeDto("Fila", "Sneakers", 3199.90, 8, "PU", "Brown", "Italy", false, "SoftFoam", "FashionSteps"));
        map.put("Woodland", new ShoeDto("Woodland", "Boots", 4899.60, 11, "Leather", "Olive", "India", true, "GripTrax", "AdventureGear"));
        map.put("Campus", new ShoeDto("Campus", "Walking", 2299.45, 9, "Synthetic", "Yellow", "India", false, "CoolTech", "EverydayWear"));

      ArrayList<Map.Entry<String , ShoeDto>> shoe = new ArrayList<>(map.entrySet());

        System.out.println("---------------------------------------------------------");
        Iterator<Map.Entry<String, ShoeDto>> iterator = shoe.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, ShoeDto> entry = iterator.next();
            System.out.println("key "+ entry.getKey()+"Values :"+entry.getValue());
        }

        System.out.println("---------------------------------------------------------");
        for (Map.Entry<String, ShoeDto> ref: map.entrySet()){
            System.out.println("Key "+ref.getKey()+ "values "+ ref.getValue());
        }
        System.out.println("---------------------------------------------------------");
        shoe.stream().forEach(s-> System.out.println("Key"+s.getKey()+" value "+s.getValue()));
    }


}

