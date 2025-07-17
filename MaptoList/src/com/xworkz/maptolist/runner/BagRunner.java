package com.xworkz.maptolist.runner;

import com.xworkz.maptolist.dto.BagDto;
import com.xworkz.maptolist.dto.BottleDto;

import java.util.*;

public class BagRunner {
    public static void main(String[] args) {


        Map<String, BagDto> map = new HashMap<>();

        map.put("Wildcraft", new BagDto("Wildcraft", "Black", 1599.99, 35, "Nylon", true, "India", 0.7, "YKK", "BackpackWorld"));
        map.put("Skybags", new BagDto("Skybags", "Blue", 1899.50, 30, "Polyester", false, "India", 0.6, "Metal", "UrbanStyle"));
        map.put("Safari", new BagDto("Safari", "Red", 2099.00, 40, "PU", true, "India", 0.8, "Plastic", "BagZone"));
        map.put("American Tourister", new BagDto("American Tourister", "Green", 2799.75, 32, "Leather", true, "China", 0.9, "YKK", "LuggageMart"));
        map.put("F Gear", new BagDto("F Gear", "Grey", 999.99, 28, "Canvas", false, "India", 0.5, "Plastic", "GearHouse"));
        map.put("Nike", new BagDto("Nike", "Black", 3499.00, 35, "Polyester", true, "Vietnam", 0.65, "YKK", "SportFit"));
        map.put("Puma", new BagDto("Puma", "White", 2999.90, 33, "Leather", false, "Thailand", 0.78, "Metal", "ActiveStore"));
        map.put("Adidas", new BagDto("Adidas", "Orange", 3199.99, 31, "Nylon", true, "Indonesia", 0.72, "YKK", "RunGear"));
        map.put("Tommy", new BagDto("Tommy", "Blue", 2699.10, 27, "Canvas", false, "USA", 0.59, "Metal", "StylePoint"));
        map.put("HRX", new BagDto("HRX", "Navy", 2499.75, 34, "PU", true, "India", 0.63, "Plastic", "FitnessPack"));


        System.out.println("All keys "+map.keySet());
        System.out.println("All values "+map.values());

        System.out.println("Nike present: "+map.containsKey("Nike"));

        List<Map.Entry<String , BagDto>> bag = new ArrayList<>(map.entrySet());

        Iterator<Map.Entry<String, BagDto>> iterator = bag.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, BagDto> entry = iterator.next();
            System.out.println("key "+ entry.getKey()+"Values :"+entry.getValue());
        }

        for (Map.Entry<String, BagDto> ref: map.entrySet()){
            System.out.println("Key "+ref.getKey()+ "values "+ ref.getValue());
        }
        bag.stream().forEach(s-> System.out.println("Key"+s.getKey()+" value "+s.getValue()));
    }

    }
