package com.xworkz.maptolist.runner;

import com.xworkz.maptolist.dto.HeadphoneDto;
import com.xworkz.maptolist.dto.MobileDto;

import java.util.*;

public class MobileRunner {
    public static void main(String[] args) {
        Map<String, MobileDto> map = new HashMap<>();

        map.put("iPhone", new MobileDto("Apple", "iPhone 14", 79999, "iOS", 128, 6.1, "A15 Bionic", "USA", true, "OLED"));
        map.put("Samsung", new MobileDto("Samsung", "Galaxy S22", 69999, "Android", 256, 6.5, "Snapdragon 8", "Korea", true, "AMOLED"));
        map.put("OnePlus", new MobileDto("OnePlus", "10T", 49999, "Android", 128, 6.7, "Snapdragon 8+", "China", true, "Fluid AMOLED"));
        map.put("Xiaomi", new MobileDto("Xiaomi", "Mi 11X", 31999, "Android", 128, 6.6, "Snapdragon 870", "China", true, "AMOLED"));
        map.put("Realme", new MobileDto("Realme", "GT Neo 3", 28999, "Android", 128, 6.7, "Dimensity 8100", "India", true, "AMOLED"));
        map.put("Vivo", new MobileDto("Vivo", "V27", 30999, "Android", 128, 6.78, "MediaTek", "India", true, "AMOLED"));
        map.put("Oppo", new MobileDto("Oppo", "Reno 8", 27999, "Android", 128, 6.4, "MediaTek", "India", true, "AMOLED"));
        map.put("Motorola", new MobileDto("Motorola", "Edge 20", 26999, "Android", 128, 6.7, "Snapdragon", "USA", true, "OLED"));
        map.put("Infinix", new MobileDto("Infinix", "Zero 5G", 17999, "Android", 128, 6.78, "Dimensity", "China", true, "LCD"));
        map.put("Nokia", new MobileDto("Nokia", "G21", 14999, "Android", 64, 6.5, "Unisoc", "Finland", false, "IPS LCD"));

        System.out.println("All keys "+map.keySet());
        System.out.println("All values "+map.values());

        System.out.println("Nike present: "+map.containsKey("Nike"));
        System.out.println("---------------------------------------------------------");
        LinkedList<Map.Entry<String , MobileDto>> mobile = new LinkedList<>(map.entrySet());

        Iterator<Map.Entry<String, MobileDto>> iterator = mobile.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, MobileDto> entry = iterator.next();
            System.out.println("key "+ entry.getKey()+"Values :"+entry.getValue());
        }
        System.out.println("---------------------------------------------------------");
        for (Map.Entry<String, MobileDto> ref: map.entrySet()){
            System.out.println("Key "+ref.getKey()+ "values "+ ref.getValue());
        }
        System.out.println("---------------------------------------------------------");
        mobile.stream().forEach(s-> System.out.println("Key"+s.getKey()+" value "+s.getValue()));
    }


    }

