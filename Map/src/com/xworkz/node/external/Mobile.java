package com.xworkz.node.external;

import java.util.HashMap;
import java.util.Map;

public class Mobile{


    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Vivo",30000);
        map.put("RealMi",400000);
        map.put("Oppo",500000);

        System.out.println(map.get("Vivo"));
        System.out.println(map.get("RealMi"));
        System.out.println(map.get("Oppo"));
    }
}
