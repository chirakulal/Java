package com.xworkz.mapiterator.runner;

import com.xworkz.mapiterator.dto.BagDTO;

import java.util.HashMap;
import java.util.Map;

public class BagRunner {

    public static void main(String[] args) {
        Map<BagDTO,Integer> bagDTO = new HashMap<>();
        bagDTO.put(new BagDTO("Wildcraft", "Black", 2499.0, 30.0, "Polyester", true, 3, "Laptop Bag", 0.9, "India"), 101);
        bagDTO.put(new BagDTO("Skybags", "Blue", 1999.0, 28.0, "Nylon", true, 2, "College Bag", 0.8, "India"), 102);
        bagDTO.put(new BagDTO("American Tourister", "Red", 3499.0, 35.0, "Polyester", true, 4, "Trekking Bag", 1.2, "USA"), 103);
        bagDTO.put(new BagDTO("Fastrack", "Grey", 1799.0, 20.0, "Canvas", false, 1, "Messenger Bag", 0.7, "India"), 104);
        bagDTO.put(new BagDTO("Tommy Hilfiger", "Brown", 5599.0, 25.0, "Leather", false, 2, "Handbag", 1.0, "USA"), 105);

        for (Map.Entry<BagDTO,Integer> entry:bagDTO.entrySet()){
            System.out.println("Key: "+entry.getKey()+" "+"Value :"+entry.getValue());
        }


    }
}
