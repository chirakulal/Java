package com.xworkz.maptolist.runner;

import com.xworkz.maptolist.dto.BottleDto;
import com.xworkz.maptolist.dto.HeadphoneDto;

import java.util.*;

public class HeadPhoneRunner {
    public static void main(String[] args) {
        Map<String, HeadphoneDto> map = new HashMap<>();

        map.put("boAt", new HeadphoneDto("boAt", "Rockerz 255", 1499, "Bluetooth", "Black", true, "India", "Neckband", 10, "AudioWorld"));
        map.put("Sony", new HeadphoneDto("Sony", "WH-1000XM4", 19999, "Bluetooth", "Silver", true, "Japan", "Over-Ear", 30, "SoundZone"));
        map.put("JBL", new HeadphoneDto("JBL", "Tune 500BT", 2999, "Bluetooth", "Blue", true, "USA", "On-Ear", 16, "BassMart"));
        map.put("Sennheiser", new HeadphoneDto("Sennheiser", "HD 450BT", 8499, "Bluetooth", "Black", true, "Germany", "Over-Ear", 30, "EliteAudio"));
        map.put("Noise", new HeadphoneDto("Noise", "Buds VS102", 1799, "TWS", "White", true, "India", "In-Ear", 18, "NoiseHub"));
        map.put("Realme", new HeadphoneDto("Realme", "Buds Wireless 2", 2499, "Bluetooth", "Yellow", true, "India", "Neckband", 20, "RealStore"));
        map.put("OnePlus", new HeadphoneDto("OnePlus", "Buds Z2", 4999, "TWS", "Black", true, "China", "In-Ear", 25, "OnePlusZone"));
        map.put("Boat", new HeadphoneDto("Boat", "Airdopes 441", 1999, "TWS", "Blue", true, "India", "In-Ear", 20, "AudioWave"));
        map.put("Apple", new HeadphoneDto("Apple", "AirPods Pro", 24999, "TWS", "White", true, "USA", "In-Ear", 24, "iStore"));
        map.put("Zebronics", new HeadphoneDto("Zebronics", "Zeb-Rush", 1299, "Wired", "Red", false, "India", "On-Ear", 0, "ZebWorld"));

        System.out.println("All keys "+map.keySet());
        System.out.println("All values "+map.values());

        System.out.println("Nike present: "+map.containsKey("Nike"));
        System.out.println("---------------------------------------------------------");
        Set<Map.Entry<String , HeadphoneDto>> head = new HashSet<>(map.entrySet());

        Iterator<Map.Entry<String, HeadphoneDto>> iterator = head.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, HeadphoneDto> entry = iterator.next();
            System.out.println("key "+ entry.getKey()+"Values :"+entry.getValue());
        }
        System.out.println("---------------------------------------------------------");
        for (Map.Entry<String, HeadphoneDto> ref: map.entrySet()){
            System.out.println("Key "+ref.getKey()+ "values "+ ref.getValue());
        }
        head.stream().forEach(s-> System.out.println("Key"+s.getKey()+" value "+s.getValue()));
    }
    }

