package com.xworkz.map.runner;

import com.xworkz.map.dto.CarDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarRunner {

    public static void main(String[] args) {
        List<CarDTO> car = new ArrayList<>();

        car.add(new CarDTO("hyundai",100));
        car.add(new CarDTO("Susuki",120));
        car.add(new CarDTO("Tata",60));
        car.add(new CarDTO("tesla",160));

        car.forEach(e-> System.out.println(e));

        System.out.println("-------------------------------------------");


    }
}
