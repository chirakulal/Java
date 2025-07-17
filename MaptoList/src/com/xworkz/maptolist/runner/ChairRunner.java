package com.xworkz.maptolist.runner;

import com.xworkz.maptolist.dto.BottleDto;
import com.xworkz.maptolist.dto.ChairDto;

import java.util.*;

public class ChairRunner {
    public static void main(String[] args) {
        Map<String, ChairDto> map = new HashMap<>();

        map.put("Godrej", new ChairDto("Godrej", "Office Chair", 5999, "Black", "Leather", true, "India", "Revolving", "Ergonomic", "OfficeMart"));
        map.put("Ikea", new ChairDto("Ikea", "Dining Chair", 3499, "White", "Wood", false, "Sweden", "Fixed", "Compact", "HomeStore"));
        map.put("Featherlite", new ChairDto("Featherlite", "Executive", 8499, "Brown", "Leatherette", true, "India", "Tilt", "Cushioned", "FeatherShop"));
        map.put("Nilkamal", new ChairDto("Nilkamal", "Plastic", 899, "Blue", "Plastic", false, "India", "Fixed", "Stackable", "FurnitureZone"));
        map.put("Durian", new ChairDto("Durian", "Work Chair", 6599, "Grey", "Fabric", true, "India", "Reclining", "BackSupport", "DurianWorld"));
        map.put("Cello", new ChairDto("Cello", "Visitor", 1999, "Black", "Plastic", false, "India", "Fixed", "Lightweight", "CelloMart"));
        map.put("Urban Ladder", new ChairDto("Urban Ladder", "Arm Chair", 7599, "Beige", "Wood + Fabric", false, "India", "Fixed", "Premium Look", "UrbanDecor"));
        map.put("Pepperfry", new ChairDto("Pepperfry", "Bar Stool", 4999, "Red", "Metal", true, "India", "Hydraulic", "Modern", "BarStyle"));
        map.put("Wakefit", new ChairDto("Wakefit", "Gaming", 8999, "Black", "PU", true, "India", "Recliner", "Neck Support", "GameHub"));
        map.put("Green Soul", new ChairDto("Green Soul", "Ergo Chair", 9999, "Green", "Mesh", true, "India", "Adjustable", "Breathable", "ComfortCraft"));


        System.out.println("All keys "+map.keySet());
        System.out.println("All values "+map.values());
        System.out.println("---------------------------------------------------------");
        System.out.println("Nike present: "+map.containsKey("Nike"));
        System.out.println("---------------------------------------------------------");
        List<Map.Entry<String , ChairDto>> chair = new ArrayList<>(map.entrySet());

        Iterator<Map.Entry<String, ChairDto>> iterator = chair.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, ChairDto> entry = iterator.next();
            System.out.println("key "+ entry.getKey()+"Values :"+entry.getValue());
        }
        System.out.println("---------------------------------------------------------");
        for (Map.Entry<String, ChairDto> ref: map.entrySet()){
            System.out.println("Key "+ref.getKey()+ "values "+ ref.getValue());
        }
        System.out.println("---------------------------------------------------------");
        chair.stream().forEach(s-> System.out.println("Key"+s.getKey()+" value "+s.getValue()));
    }

    }

