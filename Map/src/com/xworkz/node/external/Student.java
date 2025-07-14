package com.xworkz.node.external;

import java.util.HashMap;
import java.util.Map;

public class Student {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(01,"Abhishek");
        map.put(02,"Ajith");
        map.put(03,"Chirag");
        map.put(04,"Deeksha");
        map.put(05,"Diya");

        System.out.println(map.get(01));
        System.out.println(map.get(02));
        System.out.println(map.get(03));
        System.out.println(map.get(04));
        System.out.println(map.get(05));
    }
}
