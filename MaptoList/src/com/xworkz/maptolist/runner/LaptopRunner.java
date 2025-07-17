package com.xworkz.maptolist.runner;

import com.xworkz.maptolist.dto.HeadphoneDto;
import com.xworkz.maptolist.dto.LaptopDto;

import java.util.*;

public class LaptopRunner {

    public static void main(String[] args) {
        Map<String, LaptopDto> map = new HashMap<>();

        map.put("HP", new LaptopDto("HP", "Pavilion", 65999, "i5", 8, 512, 15.6, "Windows", "India", false));
        map.put("Dell", new LaptopDto("Dell", "Inspiron", 71999, "i7", 16, 1000, 14.0, "Windows", "USA", true));
        map.put("Lenovo", new LaptopDto("Lenovo", "IdeaPad", 58999, "Ryzen 5", 8, 512, 15.6, "Windows", "China", false));
        map.put("Acer", new LaptopDto("Acer", "Aspire", 47999, "i3", 4, 256, 15.0, "Windows", "Taiwan", false));
        map.put("Asus", new LaptopDto("Asus", "Vivobook", 69999, "i5", 8, 512, 14.0, "Windows", "Taiwan", true));
        map.put("MSI", new LaptopDto("MSI", "GF63", 81999, "i7", 16, 512, 15.6, "Windows", "Taiwan", false));
        map.put("Apple", new LaptopDto("Apple", "MacBook Air", 99999, "M1", 8, 256, 13.3, "macOS", "USA", true));
        map.put("Microsoft", new LaptopDto("Microsoft", "Surface", 105999, "i7", 16, 512, 13.5, "Windows", "USA", true));
        map.put("Samsung", new LaptopDto("Samsung", "Galaxy Book", 78999, "i5", 8, 256, 15.0, "Windows", "Korea", false));
        map.put("Razer", new LaptopDto("Razer", "Blade", 149999, "i9", 32, 1000, 15.6, "Windows", "USA", true));

        System.out.println("All keys "+map.keySet());
        System.out.println("All values "+map.values());
        System.out.println("---------------------------------------------------------");
        System.out.println("Nike present: "+map.containsKey("Nike"));
        System.out.println("---------------------------------------------------------");
        Set<Map.Entry<String ,LaptopDto>> laptop = new HashSet<>(map.entrySet());

        Iterator<Map.Entry<String, LaptopDto>> iterator = laptop.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, LaptopDto> entry = iterator.next();
            System.out.println("key "+ entry.getKey()+"Values :"+entry.getValue());
        }
        System.out.println("---------------------------------------------------------");
        for (Map.Entry<String, LaptopDto> ref: map.entrySet()){
            System.out.println("Key "+ref.getKey()+ "values "+ ref.getValue());
        }
        System.out.println("---------------------------------------------------------");
        laptop.stream().forEach(s-> System.out.println("Key"+s.getKey()+" value "+s.getValue()));
    }
    }

