package com.xworkz.node.external;

import java.util.HashMap;
import java.util.Map;

public class Laptop {


    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Lenavo",100000);
        map.put("Dell",50000);
        map.put("Hp",60000);

        System.out.println(map.get("Lenavo"));
        System.out.println(map.get("Dell"));
        System.out.println(map.get("Hp"));


    }
}
