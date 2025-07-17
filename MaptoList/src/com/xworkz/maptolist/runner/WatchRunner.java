package com.xworkz.maptolist.runner;

import com.xworkz.maptolist.dto.ShoeDto;
import com.xworkz.maptolist.dto.WatchDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WatchRunner {

    public static void main(String[] args) {
        Map<String, WatchDto> map = new HashMap<>();

        map.put("Fossil", new WatchDto("Fossil", "Chronograph", 8499.99, "Stainless Steel", "Black", false, "Quartz", "USA", "Round", "FashionWrist"));
        map.put("Casio", new WatchDto("Casio", "Digital", 1599.50, "Resin", "Blue", true, "Digital", "Japan", "Square", "TimeHub"));
        map.put("Apple", new WatchDto("Apple", "Smart", 30999.99, "Silicon", "White", true, "Digital", "USA", "Rectangle", "iStore"));
        map.put("Titan", new WatchDto("Titan", "Analog", 4999.00, "Leather", "Brown", false, "Quartz", "India", "Round", "WorldOfTitan"));
        map.put("Timex", new WatchDto("Timex", "Smart", 6999.00, "Rubber", "Black", true, "Digital", "USA", "Square", "WatchMart"));
        map.put("Samsung", new WatchDto("Samsung", "Smart", 27999.00, "Silicon", "Silver", true, "Digital", "Korea", "Circle", "TechMart"));
        map.put("Daniel Wellington", new WatchDto("Daniel Wellington", "Analog", 7999.00, "Leather", "Rose Gold", false, "Quartz", "Sweden", "Round", "EliteTime"));
        map.put("Boat", new WatchDto("Boat", "Smart", 2999.00, "Rubber", "Black", true, "Digital", "India", "Rectangle", "ElectroWorld"));
        map.put("Noise", new WatchDto("Noise", "Smart", 3499.00, "Silicon", "Grey", true, "Digital", "India", "Round", "NoiseShop"));
        map.put("Fire-Boltt", new WatchDto("Fire-Boltt", "Smart", 3999.00, "Silicon", "Blue", true, "Digital", "India", "Square", "BoltWorld"));
        ArrayList<Map.Entry<String , WatchDto>> watch = new ArrayList<>(map.entrySet());

        System.out.println("---------------------------------------------------------");
        Iterator<Map.Entry<String,WatchDto>> iterator = watch.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, WatchDto> entry = iterator.next();
            System.out.println("key "+ entry.getKey()+"Values :"+entry.getValue());
        }

        System.out.println("---------------------------------------------------------");
        for (Map.Entry<String, WatchDto> ref: map.entrySet()){
            System.out.println("Key "+ref.getKey()+ "values "+ ref.getValue());
        }
        System.out.println("---------------------------------------------------------");
        watch.stream().forEach(s-> System.out.println("Key"+s.getKey()+" value "+s.getValue()));
    }
}
