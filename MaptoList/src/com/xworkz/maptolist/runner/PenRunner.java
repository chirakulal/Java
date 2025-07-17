package com.xworkz.maptolist.runner;

import com.xworkz.maptolist.dto.MobileDto;
import com.xworkz.maptolist.dto.PenDto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class PenRunner {
    public static void main(String[] args) {
        Map<String, PenDto> map = new HashMap<>();

        map.put("Parker", new PenDto("Parker", "Ballpoint", 199, "Black", "Oil-based", true, "Metal", "France", "0.7mm", "StationaryMart"));
        map.put("Reynolds", new PenDto("Reynolds", "Gel", 20, "Blue", "Gel", false, "Plastic", "India", "0.5mm", "QuickPen"));
        map.put("Cello", new PenDto("Cello", "Ballpoint", 15, "Red", "Oil-based", false, "Plastic", "India", "0.7mm", "DailyNeeds"));
        map.put("Uniball", new PenDto("Uniball", "Roller", 60, "Blue", "Liquid", true, "Plastic", "Japan", "0.5mm", "WriteWorld"));
        map.put("Linc", new PenDto("Linc", "Gel", 25, "Black", "Gel", false, "Plastic", "India", "0.7mm", "PenKing"));
        map.put("Pilot", new PenDto("Pilot", "Fountain", 150, "Blue", "Liquid", true, "Metal", "Japan", "Fine", "StationPlus"));
        map.put("Camlin", new PenDto("Camlin", "Sketch", 40, "Green", "Ink", false, "Plastic", "India", "Medium", "ArtMart"));
        map.put("Flair", new PenDto("Flair", "Ball", 30, "Black", "Oil-based", false, "Plastic", "India", "0.6mm", "CheapStore"));
        map.put("Schneider", new PenDto("Schneider", "Fineliner", 80, "Purple", "Ink", false, "Plastic", "Germany", "Fine", "ColorZone"));
        map.put("Cross", new PenDto("Cross", "Luxury", 2999, "Gold", "Oil-based", true, "Metal", "USA", "Medium", "LuxuryStationery"));
        LinkedList<Map.Entry<String , PenDto>> pen = new LinkedList<>(map.entrySet());
        System.out.println("---------------------------------------------------------");
        Iterator<Map.Entry<String, PenDto>> iterator = pen.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, PenDto> entry = iterator.next();
            System.out.println("key "+ entry.getKey()+"Values :"+entry.getValue());
        }
        System.out.println("---------------------------------------------------------");
        for (Map.Entry<String, PenDto> ref: map.entrySet()){
            System.out.println("Key "+ref.getKey()+ "values "+ ref.getValue());
        }
        System.out.println("---------------------------------------------------------");
        pen.stream().forEach(s-> System.out.println("Key"+s.getKey()+" value "+s.getValue()));
    }

}

