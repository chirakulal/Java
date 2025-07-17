package com.xworkz.maptolist.runner;

import com.xworkz.maptolist.dto.BagDto;
import com.xworkz.maptolist.dto.BottleDto;

import java.util.*;

public class BottleRunner {
    public static void main(String[] args) {
        Map<String, BottleDto> map = new HashMap<>();

        map.put("Milton", new BottleDto("Milton", "Steel", 799, 1.0, true, "India", "Silver", "Hot & Cold", "EcoFriendly", "KitchenPlus"));
        map.put("Cello", new BottleDto("Cello", "Plastic", 299, 0.75, false, "India", "Blue", "Cold Only", "Lightweight", "BottleMart"));
        map.put("Tupperware", new BottleDto("Tupperware", "Plastic", 499, 1.0, false, "USA", "Red", "Cold", "Leakproof", "TupperWorld"));
        map.put("Pigeon", new BottleDto("Pigeon", "Steel", 699, 0.75, true, "India", "Grey", "Hot & Cold", "Durable", "SmartBuy"));
        map.put("Nayasa", new BottleDto("Nayasa", "Plastic", 249, 1.2, false, "India", "Green", "Water", "Stylish", "BudgetStore"));
        map.put("Borosil", new BottleDto("Borosil", "Glass", 899, 1.0, true, "India", "Transparent", "Juice", "ThermoResistant", "BoroZone"));
        map.put("Aquaguard", new BottleDto("Aquaguard", "Steel", 1199, 1.5, true, "India", "Black", "Filtered", "PurifierCap", "GuardStore"));
        map.put("TupperPro", new BottleDto("TupperPro", "Plastic", 350, 0.9, false, "Malaysia", "Pink", "Office", "BPA-Free", "HomePlus"));
        map.put("Prestige", new BottleDto("Prestige", "Steel", 599, 1.0, true, "India", "Blue", "Multi", "Ergonomic", "CookWorld"));
        map.put("Signoraware", new BottleDto("Signoraware", "Plastic", 399, 1.0, false, "India", "Orange", "School", "Shatterproof", "DailyNeeds"));

        System.out.println("All keys "+map.keySet());
        System.out.println("All values "+map.values());

        System.out.println("Nike present: "+map.containsKey("Nike"));

        List<Map.Entry<String , BottleDto>> bottle = new ArrayList<>(map.entrySet());

        Iterator<Map.Entry<String, BottleDto>> iterator = bottle.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, BottleDto> entry = iterator.next();
            System.out.println("key "+ entry.getKey()+"Values :"+entry.getValue());
        }

        for (Map.Entry<String, BottleDto> ref: map.entrySet()){
            System.out.println("Key "+ref.getKey()+ "values "+ ref.getValue());
        }
         bottle.stream().forEach(s-> System.out.println("Key"+s.getKey()+" value "+s.getValue()));
    }
}
