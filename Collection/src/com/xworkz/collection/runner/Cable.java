package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Cable {


    public static void main(String[] args) {

        Collection<Integer> cable = new ArrayList<>();
        cable.add(100);
        cable.add(150);
        cable.add(1000);
        cable.add(200);
        cable.add(250);
        cable.add(300);
        cable.add(500);
        cable.add(2000);
        cable.add(3000);
        cable.add(1003);

        System.out.println("cable =="+cable.size());

        cable.clear();

        System.out.println("cable =="+cable.size());

        cable.add(1000);
        cable.add(150);
        cable.add(1000);
        cable.add(2000);
        cable.add(2500);
        cable.add(300);
        cable.add(500);
        cable.add(200);
        cable.add(300);
        cable.add(100);

        System.out.println("cable =="+cable.size());

    }


}
