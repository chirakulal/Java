package com.xworkz.mapiterator.runner;

import com.xworkz.mapiterator.dto.JweleryDTO;

import java.util.HashMap;
import java.util.Map;

public class JweleryRunner {


    public static void main(String[] args) {
        Map<String , JweleryDTO> jwelery = new HashMap<>();
        jwelery.put("Gold",new JweleryDTO("Necklace", "Royal Twist", "Emerald", 25.6, 48250.0));
        jwelery.put("Silver",new JweleryDTO("Ring", "Minimal Loop", "None", 5.2, 6200.0));
        jwelery.put("Platinum",new JweleryDTO("Bracelet", "Infinity Link", "Diamond", 15.4, 90500.0));
        jwelery.put("Rose Gold",new JweleryDTO("Earrings", "Petal Drop", "Ruby", 8.7, 32500.0));
        jwelery.put("White Gold",new JweleryDTO("Pendant", "Snowflake Charm", "Sapphire", 6.3, 28400.0));

        for (Map.Entry<String,JweleryDTO> entry: jwelery.entrySet()){
            System.out.println("Key :"+entry.getKey()+" "+"Values :"+entry.getValue());
        }
    }
}
